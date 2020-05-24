package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonGroupDemo extends JFrame implements ActionListener {
     String city[]={"����","�Ϻ�","���","�Ͼ�","֣��","�人"};
     JRadioButton c[]=new JRadioButton[city.length];
     JLabel result=new JLabel("����һ����ѡ��ť������");
     ButtonGroup bg = new ButtonGroup();
	public ButtonGroupDemo(String title) {
		this.setTitle(title);
		this.setSize(600,200);
		this.setLayout(new FlowLayout());
		add( new JLabel("��ѡ������ϲ���ĳ��У�") );
                  for (int i=0; i<c.length; i++) {
                      c[i]=new JRadioButton(city[i]);
                      c[i].addActionListener(this);
                      add(c[i]);
                      bg.add(c[i]); //�ӵ���ť��bg
                 }
                 add(result);
	}
	public void actionPerformed(ActionEvent e) {
        String resultTemp="����ϲ���ĳ����ǣ�";
		for (int i = 0; i < c.length; i++){
		      if (c[i].isSelected() == true)
		       resultTemp = resultTemp+ c[i].getText() +" ";
		}
		result.setText(resultTemp);
		
	}
	public static void main(String[] args) {
	    new ButtonGroupDemo("RadioButton&ButtonGroupDemo").setVisible(true);
	}
}
