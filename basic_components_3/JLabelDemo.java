package basic_components_3;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo extends JFrame{
    public JLabelDemo( ){
        super( "��ܺͱ�ǩ����" );
        String [ ] s = {"�ı���ǩ", "������ͼ������", "������ͼ����·�"};
        ImageIcon [ ] ic = {null, new ImageIcon( "img1.gif" ),
            new ImageIcon( "img2.gif" )};
        int  [ ] ih  = {0, JLabel.LEFT,   JLabel.CENTER};
        int  [ ] iv  = {0, JLabel.CENTER, JLabel.BOTTOM};
        Container c = getContentPane( );
        c.setLayout( new FlowLayout(FlowLayout.LEFT) );
        for (int i=0; i<3; i++){
            JLabel aLabel = new JLabel( s[i] , ic[i], JLabel.LEFT);
            if (i>0){
                aLabel.setHorizontalTextPosition(ih[i]);
                aLabel.setVerticalTextPosition(iv[i]);
            } 
            aLabel.setToolTipText( "��" + (i+1) + "����ǩ");
            c.add( aLabel );
        } 
    }

 public static void main(String args[ ]){
        JLabelDemo app = new JLabelDemo( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 360, 150 );
        app.setVisible( true );
    } 
} 
