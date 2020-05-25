package event_processing_5;

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;
public class TestJButton implements ActionListener{
   public TestJButton(){
      JFrame f = new JFrame("Test Button Event!");
      Container c=f.getContentPane();
      JButton b = new JButton("Press Me!");  
      b.addActionListener(this);
      c.add(b, "Center");
      f.setSize(200,100);
      f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
     System.out.println("Action occurred");
     System.out.println("Button¡¯s label is:"+
     e.getActionCommand());
  }
 public static void main(String args[ ]){
    new TestJButton();
  }
}
