package org.yuan.my_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
 

public class SplitPaneDemo2 implements ListSelectionListener {
    private String[] imageNames={"1.jpg","2.jpg","3.jpg","4.jpg"};
    private JLabel picture;
    private JList list;
    private JSplitPane splitPane;

    public SplitPaneDemo2() {

        list = new JList(imageNames);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane listScrollPane = new JScrollPane(list);
 
        ImageIcon firstImage = createImageIcon("images\\" +
                                     (String)imageNames[0]);
        if (firstImage != null) {
            picture = new JLabel(firstImage);
            picture.setPreferredSize(new Dimension(firstImage.getIconWidth(),
                                                   firstImage.getIconHeight()));
        } else {
            picture = new JLabel((String)imageNames[0]);
        }
        JScrollPane pictureScrollPane = new JScrollPane(picture);
 
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,
                                   listScrollPane, pictureScrollPane);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(150);
 
        Dimension minimumSize = new Dimension(100, 50);
        listScrollPane.setMinimumSize(minimumSize);
        pictureScrollPane.setMinimumSize(minimumSize);
 
        splitPane.setPreferredSize(new Dimension(400, 200));
    }

    public JSplitPane getSplitPane() {
        return splitPane;
    }

    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting())
            return;
 
        JList theList = (JList)e.getSource();
        if (theList.isSelectionEmpty()) {
            picture.setIcon(null);
            picture.setText(null);
        } else {
            int index = theList.getSelectedIndex();
            ImageIcon newImage = createImageIcon("images\\" +
                                     (String)imageNames[index]);
            picture.setIcon(newImage);
            if (newImage != null) {
                picture.setText(null);
                picture.setPreferredSize(new Dimension(newImage.getIconWidth(),
                                                       newImage.getIconHeight() ));
            } else {
                picture.setText("Image not found: "
                                + (String)imageNames[index]);
            }
            picture.revalidate();
        }
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SplitPaneDemo2.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
 
        JFrame frame = new JFrame("SplitPaneDemo2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SplitPaneDemo2 SplitPaneDemo2 = new SplitPaneDemo2();
        frame.getContentPane().add(SplitPaneDemo2.getSplitPane());
 
        frame.pack();
        frame.setVisible(true);
    }
}