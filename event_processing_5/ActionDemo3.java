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
                 f.setTitle("�������Ϊ ("+e.getX()+", "+e.getY()+")");
             }
        }); //Ϊ�����������¼������������� 
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });//Ϊ������Ӵ����¼�������������
    }    
    public static void main(String[] args){ new ActionDemo3(); }
}
