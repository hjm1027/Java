package org.yuan.my_project;

import javax.swing.*;
public class Window extends JFrame{	
	// �����޲ι��캯��
	public Window(){}
	public Window(boolean b){
		// ���������һ����ǩ
		this.add(new JLabel("����һ�����壬��ʾ��JFrame��Ļ�������"));
		// ���ô���ı���
		this.setTitle("�Զ���Ĵ���");
		// ���ô���Ĵ�С
		this.setBounds(80,80,480,180);
		// ���ݽ��յ�boolean���ô����Ƿ���Ե�����С
		this.setResizable(b);  
		// ���ô���Ŀɼ���
		this.setVisible(true);
	}
	public static void main(String[] args){
		new Window(false);		
	}
}
