package Layout_manager_4;

import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo {
    JFrame f;
    public GridLayoutDemo(String str){
        f=new JFrame(str);
        Container c=f.getContentPane();
        c.setLayout(new GridLayout(3,2));
        for(int i=1;i<=6;i++){
        	c.add(new JButton(i+""));
        }
        f.pack( ) ;
        f.setVisible(true);
    }
    public static void main(String args[]){
       new GridLayoutDemo("GridLayout Demo"); 
   }
}
