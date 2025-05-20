/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframe8;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author manf2
 */
public class MyFrame8 extends JFrame implements KeyListener{

    JPanel mainPanel;
    JPanel compmenetsPanel;
    JButton btn1, btn2, btn3, btn4;
    String s1 = "Disply information Message";
    String s2 = "Disply Warning Message";
    String s3 = "Disply Error Message";
    String s4 = "Disply Question Message";
    String s_1 = "This is information Message";
    String s_2 = "This is Warning Message";
    String s_3 = "This is Error Message";
    String s_4 = "This is Question Message";
    MyFrame8() {
        super("JOptionPane_VARIETY");
        mainPanel = new JPanel(new FlowLayout(1, 40, 40));
        compmenetsPanel = new JPanel(new GridLayout(4, 1 , 40 , 40));
        btn1 = new JButton(s1);
        btn2 = new JButton(s2);
        btn3 = new JButton(s3);
        btn4 = new JButton(s4);
        
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        mainPanel.add(compmenetsPanel);
        compmenetsPanel.add(btn1);
        compmenetsPanel.add(btn2);
        compmenetsPanel.add(btn3);
        compmenetsPanel.add(btn4);
        compmenetsPanel.addKeyListener(this);
        compmenetsPanel.setFocusable(true);
        add(mainPanel);
        
    }
    public static void main(String[] args) {
        new MyFrame8().setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        switch (ke.getKeyChar()) {
            case '1':
                JOptionPane.showMessageDialog(null, s_1, "information Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            case '2':
                JOptionPane.showMessageDialog(null, s_2, "Warning Message", JOptionPane.WARNING_MESSAGE);
                break;
            case '3':
                JOptionPane.showMessageDialog(null, s_3, "ERROR Message", JOptionPane.ERROR_MESSAGE);
                break;
            case '4':
                JOptionPane.showMessageDialog(null, s_4, "Question Question", JOptionPane.QUESTION_MESSAGE);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {}

    
}
