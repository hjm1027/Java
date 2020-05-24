package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame  implements ActionListener {
    protected JButton button1,button2;
    protected JLabel label1;
    protected int clickedNum = 0;
    
    public ButtonDemo(String title) {
    	setTitle(title);
    	label1 = new JLabel("共点击了"+clickedNum+"次");
        button1 = new JButton("点我");
        button2 = new JButton("清零");
        button1.addActionListener(this);
        button2.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,200);
        add(button1);
        add(button2);
        add(label1);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
        	clickedNum++;   	
        }
        if (e.getSource() == button2) {
        	clickedNum = 0;   	
        }
        label1.setText("共点击了"+clickedNum+"次") ;  
    }
    
    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo("ButtonDemo1");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
