package event_processing_5;

import java.awt.event.*; //����MouseListener�����ڵİ�
import javax.swing.*;   //����JFrame���ڵİ�
public class ActionDemo implements MouseListener{
    JFrame f; 
    public ActionDemo() {
        f=new JFrame(); //�½�һ����
        f.setSize(400,300);
        f.setVisible(true);
        f.addMouseListener(this); //Ϊ������������¼�������
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
     public void mousePressed(MouseEvent e){} 
     public void mouseReleased(MouseEvent e){}
     public void mouseEntered(MouseEvent e){} 
     public void mouseExited(MouseEvent e){}
     public void mouseClicked(MouseEvent e){
        f.setTitle("�������Ϊ ("+e.getX()+", "+e.getY()+")");
     }
    public static void main(String[] args){ new ActionDemo();}
}
