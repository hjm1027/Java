package event_processing_5;

import java.awt.event.*; //����MouseAdapter���ڵİ�
import javax.swing.*;   
public class ActionDemo2 extends MouseAdapter{
    JFrame f;
    public ActionDemo2() {
        f=new JFrame();
        f.setSize(300,150);
        f.setVisible(true);       
        f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
     public void mouseClicked(MouseEvent e){ 
         f.setTitle("�������Ϊ ("+e.getX()+", "+e.getY()+")");
     }
    public static void main(String[] args){ new ActionDemo2();}
}
