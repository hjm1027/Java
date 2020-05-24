package org.yuan.my_project;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
//import java.awt.event.*;

public class ProgressBar  implements ChangeListener {
	JLabel label;
	JProgressBar pb;
	public ProgressBar () {
	     int value=0;
	     JFrame f=new JFrame("��һ��ԭ�������ʾ");
	     Container contentPane = f.getContentPane ();
	     label = new JLabel("", JLabel.CENTER);
	     label.setToolTipText ("��ʾ������Ϣ");
	     pb=new JProgressBar();
	     pb.setOrientation(JProgressBar.HORIZONTAL); //���ý���������
	     pb.setMinimum(0);                           //������Сֵ
 	     pb.setMaximum(100);                      //�������ֵ
 	    pb.setValue(value);                              //��ֵ
	    pb.setStringPainted(true);                  //���ý���������ʾ����
	    pb.addChangeListener(this);             //����ʱ�������
	    pb.setToolTipText ("������");            //������ʾ��Ϣ

	    contentPane.add(pb, BorderLayout.CENTER);
         contentPane.add(label, BorderLayout.SOUTH);		
	    f.setSize(400,60);
	    f.setVisible(true);		
	    
         for(int i=1;i<=500000000;i++) {
               if(i%5000000==0)
               pb.setValue(++value);     //�ı��������ֵ������ChangeEvent
	     }
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}
          
	public static void main(String[] args) {  new ProgressBar ();  }    
          public void stateChanged(ChangeEvent e)  {
                  int value=pb.getValue();
                  label.setText ("Ŀǰ����ɽ��ȣ�"+value+"��"); 
           }
}
