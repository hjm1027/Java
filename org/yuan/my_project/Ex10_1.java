package org.yuan.my_project;

import javax.swing.*;
import java.awt.*;
public class Ex10_1{
  public static void main(String[] args){
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame=new JFrame("Swing Frame");
    Container contentPane=frame.getContentPane();
    JPanel panel=new JPanel();
    panel.setBorder(BorderFactory.createLineBorder(Color.black,5));
    panel.setLayout(new GridLayout(2,1));
    JLabel label=new JLabel("Label",SwingConstants.CENTER);
    JButton button=new JButton("Button");
    panel.add(label); 
    panel.add(button);
    contentPane.add(panel);
    frame.pack();//对组件进行排列
    frame.show();//显示
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
} 
