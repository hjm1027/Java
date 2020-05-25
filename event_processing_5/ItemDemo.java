package event_processing_5;

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;
public class ItemDemo implements ItemListener{
     JFrame f;
     JPanel p1,p2,p3;
     JLabel birthPlace,hobby;
     JComboBox place;
     JCheckBox hobby1,hobby2,hobby3;
     public ItemDemo(String title){
         f=new JFrame(title);
         p1=new JPanel();
         birthPlace=new JLabel("出生地:");
         place=new JComboBox();
         place.addItemListener(this);
         place.addItem("杭州");
         place.addItem("上海");
         place.addItem("南京");
         place.addItem("苏州");
         p1.add(birthPlace);
         p1.add(place);
         f.add(p1,"North");
         p2=new JPanel();
         p2.setLayout(new GridLayout(3,1));
         hobby=new JLabel("业余爱好:");
         hobby1=new JCheckBox("运动");
         hobby1.addItemListener(this);
         hobby2=new JCheckBox("旅游");
         hobby2.addItemListener(this);
         hobby3=new JCheckBox("上网");
         hobby3.addItemListener(this);
         p2.add(hobby1);
         p2.add(hobby2);
         p2.add(hobby3);
         p3=new JPanel();
         p3.add(hobby);
         p3.add(p2);
         f.add(p3,"Center");
   
         f.pack();
         f.setVisible(true);
    }
     public void itemStateChanged(ItemEvent e){
    	  if(e.getSource()==place&&e.getStateChange()==ItemEvent.SELECTED){
    	       	  System.out.println("您当前选择的是"+place.getSelectedItem());
    	       }
    	       else if(e.getSource()==hobby1 &&hobby1.isSelected() ){
    	          System.out.println("您的业余爱好有："+hobby1.getLabel());
    	       }
    	       else if(e.getSource()==hobby2 &&hobby2.isSelected()){
    	          System.out.println("您的业余爱好有："+hobby2.getLabel());
    	       }
    	       else if(e.getSource()==hobby3 &&hobby3.isSelected()){
    	          System.out.println("您的业余爱好有："+hobby3.getLabel());
    	       }
    	    }
    	    public static void main(String args[ ]){
    	        new ItemDemo("测试ItemListener!");
    	   }
    	}
