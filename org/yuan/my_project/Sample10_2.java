package org.yuan.my_project;

import javax.swing.*;
public class Sample10_2{
    public static void main(String[] args){
	JFrame myWindow = new JFrame();
	myWindow.add(new JLabel("这是一个框体，演示了JFrame类的基本功能"));
	myWindow.setTitle("自定义的框体");
	myWindow.setBounds(80,80,480,180);
	myWindow.setResizable(false);
	myWindow.setVisible(true);
    }
}