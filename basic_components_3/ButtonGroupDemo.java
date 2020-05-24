package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonGroupDemo extends JFrame implements ActionListener {
     String city[]={"北京","上海","天津","南京","郑州","武汉"};
     JRadioButton c[]=new JRadioButton[city.length];
     JLabel result=new JLabel("这是一个单选按钮的例子");
     ButtonGroup bg = new ButtonGroup();
	public ButtonGroupDemo(String title) {
		this.setTitle(title);
		this.setSize(600,200);
		this.setLayout(new FlowLayout());
		add( new JLabel("请选择你最喜欢的城市：") );
                  for (int i=0; i<c.length; i++) {
                      c[i]=new JRadioButton(city[i]);
                      c[i].addActionListener(this);
                      add(c[i]);
                      bg.add(c[i]); //加到按钮组bg
                 }
                 add(result);
	}
	public void actionPerformed(ActionEvent e) {
        String resultTemp="您最喜欢的城市是：";
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
