package event_processing_5;

import java.awt.event.*; 
import javax.swing.*;
public class ActionDemo3{
    JFrame f;
    public ActionDemo3() {
        f=new JFrame();
        f.setSize(300,150);
        f.setVisible(true);       
        f.addMouseListener(new MouseAdapter(){                                              
             public void mouseClicked(MouseEvent e){
                 f.setTitle("点击坐标为 ("+e.getX()+", "+e.getY()+")");
             }
        }); //为窗口添加鼠标事件监听器语句结束 
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });//为窗口添加窗口事件监听器语句结束
    }    
    public static void main(String[] args){ new ActionDemo3(); }
}
