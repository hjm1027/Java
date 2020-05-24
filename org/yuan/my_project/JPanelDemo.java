package org.yuan.my_project;

import java.awt.*;
import javax.swing.*;
public class JPanelDemo extends JFrame{
            public JPanel getGUI(){
	      JPanel p=new JPanel();
	       p.add(new JButton("Press me"));
	       return p;
            }
            public static void main(String args[]){
	        JPanelDemo jp=new JPanelDemo();
	        jp.setTitle("JPanel Demo");
	        jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        jp.setContentPane(jp.getGUI());
	        jp.setSize(200,200);
	        jp.setVisible(true);
	}
}
