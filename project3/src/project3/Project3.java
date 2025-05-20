/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author manf2
 */
public class Project3 extends JFrame implements ActionListener {

    JButton btn1;
    Project3() {
        super("JFrame Demo");
        btn1 = new JButton("Click me");
        
        btn1.setBounds(120, 150, 120, 120);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setType(Type.UTILITY);
        Border insideBorder = BorderFactory.createLineBorder(Color.BLUE, 2);
        //btn1.setBorder(BorderFactory.createCompoundBorder(insideBorder, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        btn1.setBorder(new TitledBorder(new LineBorder(Color.red , 3) , ""));
        btn1.addActionListener(this);
        
        add(btn1);
    }

    public static void main(String[] args) {
        new Project3().setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
}
