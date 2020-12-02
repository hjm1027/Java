import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Crawler {
    private static final String CONNECTION = "jdbc:mysql://localhost:3306/etc?autoReconnect=true&useSSL=false";

    public static void getBilibili(String what, String n ) {
        try {
            //连接数据库
            Class.forName("com.mysql.jdbc.Driver");
            Properties p = new Properties();
            p.put("user","root");
            p.put("password","123");
            Connection c = DriverManager.getConnection(CONNECTION,p);
            Statement statement = c.createStatement();      

            //发起请求
            String URL = "https://api.bilibili.com/x/web-interface/search/type?context=&page="+n+"&order=&keyword="+what+"&duration=&tids_1=&tids_2=&__refresh__=true&_extra=&search_type=video&highlight=1&single_column=0";
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();// 打开连接
            
            //设置请求头
            connection.setRequestProperty("Accept-Encoding", "utf-8");
            //connection.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
            connection.setRequestProperty("Connection", "keep-alive");
            connection.setRequestProperty("authority", "api.bilibili.com");
            connection.setRequestProperty("accept", "application/json, text/plain, */*");
            connection.setRequestProperty("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.102 Safari/537.36");
            connection.setRequestProperty("origin", "https://search.bilibili.com");
            connection.setRequestProperty("sec-fetch-site", "same-site");
            connection.setRequestProperty("sec-fetch-mode", "cors");
            connection.setRequestProperty("sec-fetch-dest", "empty");
            connection.setRequestProperty("referer", "https://search.bilibili.com/");
            connection.setRequestProperty("accept-language", "zh-CN,zh;q=0.9,en;q=0.8");
            connection.setRequestProperty("cookie", "_uuid=F86CCDCC-D5D9-C65B-82D9-A41B90CB345559480infoc; buvid3=E3847E71-51AA-43DD-87F1-BF891A879670143087infoc; CURRENT_FNVAL=80; bfe_id=603589b7ce5e180726bfa88808aa8947");
            connection.connect();
           
            // 获取输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {// 循环读取流
                sb.append(line);
            }
            br.close();
            connection.disconnect();
            String result = sb.toString();

            String urlPattern = "\"arcurl\":\".*?\"";
            String titlePattern = "\"title\":\".*?\",";
            String descriptionPattern = "\"description\":\".*?\"";
            String durationPattern = "\"duration\":\".*?\"";
 
            // 创建 Pattern 对象
            Pattern p1 = Pattern.compile(urlPattern);
            Pattern p2 = Pattern.compile(titlePattern);
            Pattern p3 = Pattern.compile(descriptionPattern);
            Pattern p4 = Pattern.compile(durationPattern);
        
            List<String> urlList=new ArrayList<String>();
            List<String> titleList=new ArrayList<String>();
            List<String> descriptionList=new ArrayList<String>();
            List<String> durationList=new ArrayList<String>();

            //获取各字段的集合
            Matcher m1 = p1.matcher(result);
            while (m1.find( )) {
                urlList.add(m1.group());
            } 

            Matcher m2 = p2.matcher(result);
            while (m2.find( )) {
                String deal =m2.group();
                deal = deal.replace("\\u003cem class=\\\"keyword\\\"\\u003e","");
                deal = deal.replace("\\u003c/em\\u003e","");
                titleList.add(deal);
            } 

            Matcher m3 = p3.matcher(result);
            while (m3.find( )) {
                descriptionList.add(m3.group());
            } 

            Matcher m4 = p4.matcher(result);
            while (m4.find( )) {
                durationList.add(m4.group());
            } 

            //显示结果并写入数据库
            for (int i=0; i<urlList.size(); i++){
                System.out.println(urlList.get(i));
                System.out.println(titleList.get(i));
                System.out.println(descriptionList.get(i));
                System.out.println(durationList.get(i));
                System.out.println();
                
                String sql = "insert into `bilibili`(url,title,description,duration)values('"+urlList.get(i).substring(10,urlList.get(i).length()-1) +"','"+ titleList.get(i).substring(9,titleList.get(i).length()-2)+"','"+descriptionList.get(i).substring(15,descriptionList.get(i).length()-1)+"','"+durationList.get(i).substring(12,durationList.get(i).length()-1)+"')";
                statement.executeUpdate(sql);
            }
            statement.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnknownHostException {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入查询的值：");
        String what = input.next();
        System.out.print("请输入查询页数：");
        String n = input.next();
        getBilibili(what,n);
        input.close();
    }
}