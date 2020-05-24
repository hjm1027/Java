package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextAreaDemo extends JFrame implements ActionListener {
    private JPanel jp=new JPanel();
    private JButton[] jbArray=
         {new JButton("自动换行"),new JButton("不换行"),
          new JButton("单词边界"),new JButton("字符边界")};
    private JTextArea jta=new JTextArea();

    //将文本区作为被滚动控件创建滚动窗体
    private JScrollPane jsp=new JScrollPane(jta);
    public JTextAreaDemo(){      
        jp.setLayout(null); //设置JPanel的布局管理器        
        for(int i=0;i<4;i++){  //循环对按钮进行处理
            //设置按钮的大小和位置
            jbArray[i].setBounds(20+i*110,120,90,20);
            jp.add(jbArray[i]);
            jbArray[i].addActionListener(this);			
        }
        jsp.setBounds(20,20,450,80); //设置JScrollPane的大小与位置
        jp.add(jsp);//将JScrollPane添加到JPanel容器中

        //设置JTextArea为自动换行
        jta.setLineWrap(true);        
        for(int i=0;i<20;i++){//为JTextArea添加10条文本
            jta.append("["+i+"]Hello, this is an Example!");
        }

        //将JPanel容器添加进窗体
        this.add(jp);

        //设置窗体的标题、大小位置以及可见性
        this.setTitle("文本区与滚动条");
        this.setResizable(false);
        this.setBounds(100,100,500,180);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jbArray[0]){ //按下自动换行按钮
            jta.setLineWrap(true);
        }
        else if(e.getSource()==jbArray[1]) {//按下不换行按钮
            jta.setLineWrap(false);
        }
        else if(e.getSource()==jbArray[2]){ //按下单词边界按钮
            jta.setWrapStyleWord(true);
        }
        else if(e.getSource()==jbArray[3]){ //按下字符边界按钮
            jta.setWrapStyleWord(false);
        }
    }
   public static void main(String[] args) {
         new JTextAreaDemo();
  
    }
}
