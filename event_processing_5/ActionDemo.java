package event_processing_5;

import java.awt.event.*; //载入MouseListener类所在的包
import javax.swing.*;   //载入JFrame所在的包
public class ActionDemo implements MouseListener{
    JFrame f; 
    public ActionDemo() {
        f=new JFrame(); //新建一窗口
        f.setSize(400,300);
        f.setVisible(true);
        f.addMouseListener(this); //为窗口增加鼠标事件监听器
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
     public void mousePressed(MouseEvent e){} 
     public void mouseReleased(MouseEvent e){}
     public void mouseEntered(MouseEvent e){} 
     public void mouseExited(MouseEvent e){}
     public void mouseClicked(MouseEvent e){
        f.setTitle("点击坐标为 ("+e.getX()+", "+e.getY()+")");
     }
    public static void main(String[] args){ new ActionDemo();}
}
