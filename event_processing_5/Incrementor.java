package event_processing_5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Incrementor implements ActionListener{
    JTextField numberTxf;
    JButton incrementBtn,decrementBtn;
    public void makeGUI(){
        JFrame frm = new JFrame("Incrementor");
        Container c=frm.getContentPane();
        c.setLayout(new FlowLayout());
        numberTxf = new JTextField("0",5);
        c.add(numberTxf);
        incrementBtn = new JButton("Increment");
        c.add(incrementBtn);
        incrementBtn.addActionListener(this);
        decrementBtn= new JButton("Decrement");
        c.add(decrementBtn);
        decrementBtn.addActionListener(this);
        frm.setSize(300,100);
        frm.setVisible(true);
   }
    public void actionPerformed(ActionEvent e) {
        int oldNum = Integer.parseInt(numberTxf.getText());
        int newNum = oldNum;
        if (e.getActionCommand().equals("Increment")){
            newNum++;
        }
       else if (e.getActionCommand().equals("Decrement")) {
           newNum--;
        }
      numberTxf.setText(String.valueOf(newNum));
    }
    public static void main(String args[]) {
     Incrementor i = new Incrementor();
     i.makeGUI();
    }
}
