/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtest;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author manf2
 */
public class Jtest extends JFrame {

    JLabel lbl;
    JPasswordField pass;
    JButton btn1, btn2, btn3;
    JPanel mainPanel, panel1, panel2;

    Jtest() {
        super("Password Test");
        lbl = new JLabel("Enter Password");
        pass = new JPasswordField();
        btn1 = new JButton("OK");
        btn2 = new JButton("Clear");
        btn3 = new JButton("Exit");
        mainPanel = new JPanel(new GridLayout(2, 1));
        panel1 = new JPanel(null);
        panel2 = new JPanel(null);

        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lbl.setBounds(75, 10, 100, 30);
        pass.setBounds(180, 15, 140, 22);
        
        btn1.setBounds(60, 5, 80, 30);
        btn2.setBounds(150, 5, 80, 30);
        btn3.setBounds(240, 5, 80, 30);
        pass.setEchoChar('X');
        
        panel1.add(lbl);
        panel1.add(pass);

        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (pass.getText().equals("libya")) {
                    JOptionPane.showMessageDialog(null, "Correct Password !");
                    System.exit(0);

                } else {
                    JOptionPane.showMessageDialog(null, "inCorrect Password !");
                    System.exit(0);

                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pass.setText("");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        add(mainPanel);
        

    }

    public static void main(String[] args) {
        new Jtest().setVisible(true);
    }

}
