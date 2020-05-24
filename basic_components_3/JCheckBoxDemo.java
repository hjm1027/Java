package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo extends JFrame implements ActionListener {
     String city[]={"����","�Ϻ�","���","�Ͼ�","֣��","�人"};
     JCheckBox c[]=new JCheckBox[city.length];
     JLabel result=new JLabel("����һ����ѡ�������");

	public JCheckBoxDemo(String title) {
		this.setTitle(title);
		this.setSize(600, 200);
		this.setLayout(new FlowLayout());
		add( new JLabel("��ѡ����ϲ���ĳ��У�") );
                for (int i=0; i<c.length; i++) {
                     c[i]=new JCheckBox(city[i]);
                     c[i].addActionListener(this);
                     add(c[i]);
                }
                add(result);
	}
	public void actionPerformed(ActionEvent e) {
        String resultTemp="��ϲ���ĳ����У�";
		for (int i = 0; i < c.length; i++){
		        if (c[i].isSelected() == true)
		        resultTemp = resultTemp+ c[i].getText() +" ";
		}
		result.setText(resultTemp);
		
	}
	public static void main(String[] args) {
		new JCheckBoxDemo("JCheckBoxDemo").setVisible(true);
	}
}
