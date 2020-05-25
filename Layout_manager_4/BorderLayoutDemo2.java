package Layout_manager_4;

import java.awt.*;
import javax.swing.*;
public class BorderLayoutDemo2 extends JFrame {      
    public BorderLayoutDemo2() {
    	Container c=getContentPane();
        c.setLayout(new BorderLayout(5,5));    
        c.add(new JButton("North"), "North");       
        c.add( new JButton("South"),"South");
        //c.add("South",new Button("South"));
        //c.add(new Button(" South "), BorderLayout.SOUTH); 
        c.add( new JButton("East"),"East");
        c.add( new JButton("West"),"West");
        c.add( new JButton("Center"),"Center");
    }
    public static void main(String args[]) {
        BorderLayoutDemo2 window = new BorderLayoutDemo2();    
        window.setTitle("BorderLayout Demo");
        window.pack();
        window.setVisible(true);
    }
}
