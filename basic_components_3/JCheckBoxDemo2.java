package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JCheckBoxDemo2 extends JFrame implements  ItemListener {
     String city[]={"北京","上海","天津","南京","郑州","武汉"};
     JComboBox combo;
     JLabel la,result;
	public JCheckBoxDemo2(String title) {
		this.setTitle(title);
		this.setSize(600, 200);
		this.setLayout(null);
		la=new JLabel("请选择你喜欢的城市：");
		la.setBounds(100,10,200,25);
		add( la);

        combo=new JComboBox(city);
        combo.setBounds(250, 10, 200, 25);
        combo.setEditable (true);
        ComboBoxEditor editor=combo.getEditor();
        combo.configureEditor (editor,"请选择或直接输入城市名称"); 
        combo.addItemListener(this);
        add(combo);
        result=new JLabel("这是一个复选框的例子");
        result.setBounds(100,100,200,25);
        add(result);
	}
	public void itemStateChanged(ItemEvent e) {
		String resultTemp="您最喜欢的城市是："+ e.getItem().toString();
		result.setText(resultTemp);
	}

	public static void main(String[] args) {
		new JCheckBoxDemo2("JCheckBoxDemo2").setVisible(true);
	}
}
