package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JCheckBoxDemo2 extends JFrame implements  ItemListener {
     String city[]={"����","�Ϻ�","���","�Ͼ�","֣��","�人"};
     JComboBox combo;
     JLabel la,result;
	public JCheckBoxDemo2(String title) {
		this.setTitle(title);
		this.setSize(600, 200);
		this.setLayout(null);
		la=new JLabel("��ѡ����ϲ���ĳ��У�");
		la.setBounds(100,10,200,25);
		add( la);

        combo=new JComboBox(city);
        combo.setBounds(250, 10, 200, 25);
        combo.setEditable (true);
        ComboBoxEditor editor=combo.getEditor();
        combo.configureEditor (editor,"��ѡ���ֱ�������������"); 
        combo.addItemListener(this);
        add(combo);
        result=new JLabel("����һ����ѡ�������");
        result.setBounds(100,100,200,25);
        add(result);
	}
	public void itemStateChanged(ItemEvent e) {
		String resultTemp="����ϲ���ĳ����ǣ�"+ e.getItem().toString();
		result.setText(resultTemp);
	}

	public static void main(String[] args) {
		new JCheckBoxDemo2("JCheckBoxDemo2").setVisible(true);
	}
}
