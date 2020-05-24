package org.yuan.my_project;

import javax.swing.*;
class MyWindow extends JFrame{	
	// 定义无参构造函数
	public MyWindow(){}
	public MyWindow(boolean b){
		// 向框体中添加一个标签
		this.add(new JLabel("这是一个框体，演示了JFrame类的基本功能"));
		// 设置框体的标题
		this.setTitle("自定义的框体");
		// 设置框体的大小
		this.setBounds(80,80,480,180);
		// 根据接收的boolean设置框体是否可以调整大小
		this.setResizable(b);  
		// 设置框体的可见性
		this.setVisible(true);
	}
}
public class Sample10_3{
		public static void main(String[] args){
		// 创建MyWindow类的对象，并传递true值使得框体可以调整大小
		new MyWindow(true);		
	}
}
