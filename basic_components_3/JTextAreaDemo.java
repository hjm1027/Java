package basic_components_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextAreaDemo extends JFrame implements ActionListener {
    private JPanel jp=new JPanel();
    private JButton[] jbArray=
         {new JButton("�Զ�����"),new JButton("������"),
          new JButton("���ʱ߽�"),new JButton("�ַ��߽�")};
    private JTextArea jta=new JTextArea();

    //���ı�����Ϊ�������ؼ�������������
    private JScrollPane jsp=new JScrollPane(jta);
    public JTextAreaDemo(){      
        jp.setLayout(null); //����JPanel�Ĳ��ֹ�����        
        for(int i=0;i<4;i++){  //ѭ���԰�ť���д���
            //���ð�ť�Ĵ�С��λ��
            jbArray[i].setBounds(20+i*110,120,90,20);
            jp.add(jbArray[i]);
            jbArray[i].addActionListener(this);			
        }
        jsp.setBounds(20,20,450,80); //����JScrollPane�Ĵ�С��λ��
        jp.add(jsp);//��JScrollPane��ӵ�JPanel������

        //����JTextAreaΪ�Զ�����
        jta.setLineWrap(true);        
        for(int i=0;i<20;i++){//ΪJTextArea���10���ı�
            jta.append("["+i+"]Hello, this is an Example!");
        }

        //��JPanel������ӽ�����
        this.add(jp);

        //���ô���ı��⡢��Сλ���Լ��ɼ���
        this.setTitle("�ı����������");
        this.setResizable(false);
        this.setBounds(100,100,500,180);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jbArray[0]){ //�����Զ����а�ť
            jta.setLineWrap(true);
        }
        else if(e.getSource()==jbArray[1]) {//���²����а�ť
            jta.setLineWrap(false);
        }
        else if(e.getSource()==jbArray[2]){ //���µ��ʱ߽簴ť
            jta.setWrapStyleWord(true);
        }
        else if(e.getSource()==jbArray[3]){ //�����ַ��߽簴ť
            jta.setWrapStyleWord(false);
        }
    }
   public static void main(String[] args) {
         new JTextAreaDemo();
  
    }
}
