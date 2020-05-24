package org.yuan.my_project;

import javax.swing.*;
public class Window extends JFrame{	
	// 定义无参构造函数
	public Window(){}
	public Window(boolean b){
		// 向窗体中添加一个标签
		this.add(new JLabel("这是一个窗体，演示了JFrame类的基本功能"));
		// 设置窗体的标题
		this.setTitle("自定义的窗体");
		// 设置窗体的大小
		this.setBounds(80,80,480,180);
		// 根据接收的boolean设置窗体是否可以调整大小
		this.setResizable(b);  
		// 设置窗体的可见性
		this.setVisible(true);
	}
	public static void main(String[] args){
		new Window(false);		
	}
}
