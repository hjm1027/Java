package Layout_manager_4;

import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame {      
    public FlowLayoutDemo() {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Buttons:"));
        c.add(new JButton("Button 1"));
        c.add(new JButton("2"));
        c.add(new JButton("Button 3"));
        c.add(new JButton("Long-Named Button 4"));
        c.add(new JButton("Button 5"));        
    }
    public static void main(String args[]) {
        FlowLayoutDemo window = new FlowLayoutDemo();
        window.setTitle("FlowLayout Demo");
        window.pack();//窗口大小设置为适合组件最佳尺寸与布局所需的空间
        window.setVisible(true);
    }
}
