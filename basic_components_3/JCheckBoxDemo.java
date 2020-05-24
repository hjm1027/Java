package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo extends JFrame implements ActionListener {
     String city[]={"北京","上海","天津","南京","郑州","武汉"};
     JCheckBox c[]=new JCheckBox[city.length];
     JLabel result=new JLabel("这是一个复选框的例子");

	public JCheckBoxDemo(String title) {
		this.setTitle(title);
		this.setSize(600, 200);
		this.setLayout(new FlowLayout());
		add( new JLabel("请选择你喜欢的城市：") );
                for (int i=0; i<c.length; i++) {
                     c[i]=new JCheckBox(city[i]);
                     c[i].addActionListener(this);
                     add(c[i]);
                }
                add(result);
	}
	public void actionPerformed(ActionEvent e) {
        String resultTemp="您喜欢的城市有：";
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
