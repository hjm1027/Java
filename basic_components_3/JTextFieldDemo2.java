package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo2 extends JFrame implements ActionListener {
      
    protected JTextField jtf=new JTextField(30);
    protected JButton button=new JButton("确定");
    protected JLabel label1=new JLabel("输入的字符是：");

    public JTextFieldDemo2(){
        this.setLayout(null);
        this.setBounds(100,100,400,200);
        jtf.setBounds(20,20,360,20);
        button.setBounds(170,60,60,30);
        label1.setBounds(20,100,360,20);
        button.addActionListener(this);
        jtf.addActionListener(this);
        add(jtf); add(button);   add(label1);
        this.setTitle("文本框示例");
        this.setResizable(false);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button || e.getSource()==jtf){
            label1.setText("输入的字符是：" + jtf.getText());
        }    
    }

   public static void main(String[] args) {
        JTextFieldDemo2 frame = new JTextFieldDemo2();
        frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                      System.exit(0);
            }
        });
    }
}
