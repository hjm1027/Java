package basic_components_3;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldDemo{
    public static void main(String args[ ]){
        JFrame app = new JFrame( "�ı��༭������" );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 320, 120 );
        Container c = app.getContentPane( );
        c.setLayout( new FlowLayout( ) );
        JTextField [ ] t = {
            new JTextField("�����ı�:", 8), new JTextField("��ʾ", 15),
            new JTextField("�����ı�:", 8), new JPasswordField("����", 15)};
        t[0].setEditable( false );
        t[2].setEditable( false );
        for (int i=0; i<4; i++)
            c.add( t[i] );
        app.setVisible( true );
    }
}
