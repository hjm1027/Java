package org.yuan.my_project;

import javax.swing.*;
class MyWindow extends JFrame{	
	// �����޲ι��캯��
	public MyWindow(){}
	public MyWindow(boolean b){
		// ����������һ����ǩ
		this.add(new JLabel("����һ�����壬��ʾ��JFrame��Ļ�������"));
		// ���ÿ���ı���
		this.setTitle("�Զ���Ŀ���");
		// ���ÿ���Ĵ�С
		this.setBounds(80,80,480,180);
		// ���ݽ��յ�boolean���ÿ����Ƿ���Ե�����С
		this.setResizable(b);  
		// ���ÿ���Ŀɼ���
		this.setVisible(true);
	}
}
public class Sample10_3{
		public static void main(String[] args){
		// ����MyWindow��Ķ��󣬲�����trueֵʹ�ÿ�����Ե�����С
		new MyWindow(true);		
	}
}
