package Layout_manager_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BorderLayoutDemo extends JFrame implements ActionListener{
	String names[]={"北","南","东","西","中"};
    Button but[]=new Button[names.length];
	public BorderLayoutDemo() {
		setTitle("BorderLayoutDemo");
		setSize(400,300);
		setLayout(new BorderLayout(10,10));
                for (int i = 0; i<names.length; i++){
         	     but[i]=new Button(names[i]);
         	     but[i].addActionListener(this);
                 }
                 add("North", but[0]);
                 add(but[1],"South");
                 add(BorderLayout.EAST,  but[2]);
                 add(but[3], BorderLayout.WEST);
                 add("Center", but[4]);
	          setVisible(true);
	          setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i<but.length; i++){
	     	        if(e.getSource() == but[i])
	     	              but[i].setVisible(false);
	     	         else
	     	              but[i].setVisible(true);
                }
	}

	public static void main(String[] args) {
		BorderLayoutDemo frame = new BorderLayoutDemo();
	}
}
