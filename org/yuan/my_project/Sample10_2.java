package org.yuan.my_project;

import javax.swing.*;
public class Sample10_2{
    public static void main(String[] args){
	JFrame myWindow = new JFrame();
	myWindow.add(new JLabel("����һ�����壬��ʾ��JFrame��Ļ�������"));
	myWindow.setTitle("�Զ���Ŀ���");
	myWindow.setBounds(80,80,480,180);
	myWindow.setResizable(false);
	myWindow.setVisible(true);
    }
}