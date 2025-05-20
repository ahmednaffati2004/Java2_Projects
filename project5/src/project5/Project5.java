/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author manf2
 */
public class Project5 extends JFrame {

    DefaultListModel dlm;
    JList l;
    JScrollPane sp;
    JPanel mainPanel , centerPanel , southPanel;
    JButton btn1 , btn2;
    static int counter = -1;

    Project5() {
        super("List Model Example ");
        dlm = new DefaultListModel();
        l = new JList(dlm);
        sp = new JScrollPane(l);
        mainPanel = new JPanel(new BorderLayout());
        
        centerPanel = new JPanel(new GridLayout(1, 1));
        //centerPanel.setBackground(Color.yellow);
        southPanel = new JPanel(new FlowLayout());
        
        btn1 = new JButton("Add element");
        btn2 = new JButton("Remove Element");
        
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        centerPanel.add(sp);
        southPanel.add(btn1);
        southPanel.add(btn2);
        
        mainPanel.add(centerPanel , BorderLayout.CENTER);
        mainPanel.add(southPanel , BorderLayout.SOUTH);
        
        add(mainPanel);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dlm.addElement("Element"+ ++counter);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dlm.removeElement("Element"+counter--);
            }
        });
        
    }

    public static void main(String[] args) {
        new Project5().setVisible(true);
    }
    
}
