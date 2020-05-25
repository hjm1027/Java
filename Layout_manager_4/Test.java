package Layout_manager_4;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
public class Test{
	public static void main(String args[]){
        Calculator myCal = new Calculator();
    }
}

class Calculator extends JFrame implements ActionListener, WindowListener{
  static String names[]=
  {"7", "8", "9", "/", "CE",
   "4", "5", "6", "*", "C",
   "1", "2", "3", "-", " 退格",
   "0", "+/-", ".", "+", "="};
  String resultStr;
  JButton buts[] = new JButton[names.length];
  JPanel pa1;
  JTextField text;
  public Calculator() {
 	   super("我的计算器");
 	   this. resultStr=new String();
 	   this.setSize(350,300);
         this.setLayout(new BorderLayout());
         this.pa1=new JPanel();
         this.text=new JTextField("0",12);  
         pa1.setLayout(new GridLayout(4, 5, 5, 5));
        this. setFont(new Font("Arial",Font.BOLD,12));
       for (int i=0;i<buts.length;i++){
         buts[i]=new JButton(names[i]);
         buts[i].addActionListener(this);
         pa1.add(buts[i]);
      }
      this.add("North",text);
      this.add("Center",pa1);
      this.addWindowListener(this);
     this. setVisible(true);
 }
  public void actionPerformed(ActionEvent e) {
	  	String str1=new String();
	  	for (int i = 0; i<buts.length; i++){
	  		if(e.getSource()==buts[i]){  str1 = buts[i].getLabel();
	  		}
	  	}
	  	resultStr+=str1;
	  	text.setText(resultStr);
	  }
		public void windowOpened(WindowEvent e) {  }
		public void windowClosing(WindowEvent e) {	dispose();
			System.exit(0);
		}
		public void windowClosed(WindowEvent e) {	}
		public void windowIconified(WindowEvent e) {	}
		public void windowDeiconified(WindowEvent e) {	}
		public void windowActivated(WindowEvent e) {	}
		public void windowDeactivated(WindowEvent e) {	}
	}
