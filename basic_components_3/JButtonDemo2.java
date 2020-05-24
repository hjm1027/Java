package basic_components_3;

import java.awt.*;
import javax.swing.*;

public class JButtonDemo2 extends JFrame {
    protected JButton button1,button2,button3;
    protected JLabel label1;
    protected int clickedNum = 0,i;
    public JButtonDemo2(String title) {
    	setTitle(title);
    	ImageIcon [ ] ic = {new ImageIcon("left arrow.gif"), new ImageIcon("right arrow.gif")};
        button1 = new JButton("��",ic[0]);
        button2 = new JButton("�м�");
        button3 = new JButton("��",ic[1]);
        setLayout(new FlowLayout());
        setSize(250,120);
        add(button1);
        add(button2);
        add(button3);        
        JCheckBox [ ] ck = {new JCheckBox("��"), new JCheckBox("��")};
        for (i=0; i<ck.length; i++){
               add( ck[i] );
               ck[i].setSelected(true);
        } 
        JRadioButton[ ] r={new JRadioButton("��"), new JRadioButton("��")};
        ButtonGroup rg = new ButtonGroup( );
        for (i=0; i < r.length; i++){
                add( r[i] );
                rg.add( r[i] );
        } 
        r[0].setSelected(true);
        r[1].setSelected(false);

    }

    public static void main(String[] args) {
        JButtonDemo2 frame = new JButtonDemo2("JButtonDemo21");
        frame.setVisible(true);
    }
}
