/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.q;

/**
 *
 * @author mac
 */


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Q{

    public static void main(String[] args) {
        JFrame frame=new JFrame("Radio Buttons Events");
        frame.setSize(600,300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JRadioButton plain=new JRadioButton("plain");
        JRadioButton bold=new JRadioButton("Bold");
        JRadioButton italic=new JRadioButton("Italic");
        JRadioButton capital=new JRadioButton("Capital");
        JRadioButton small=new JRadioButton("Small");
        
        ButtonGroup styleGroup=new ButtonGroup();
        styleGroup.add(plain);
        styleGroup.add(bold);
        styleGroup.add(italic);
        
        ButtonGroup caseGroup=new ButtonGroup();
        caseGroup.add(capital);
        caseGroup.add(small);
        
        Font fontplain=new Font("Arial",Font.PLAIN,10);
        Font fontbold=new Font("Arial",Font.BOLD,20);
        Font fontitalic=new Font("Arial",Font.ITALIC,30);
        Font fontcapital=new Font("Arial",Font.PLAIN,35);
        Font fontsmall=new Font("Arial",Font.BOLD,40);
        
        JLabel result=new JLabel("THE_SHAPE_CHANGED");
        
        plain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            result.setFont(fontplain);
            }
        });
        bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setFont(fontbold);
            }
        });
        italic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              result.setFont(fontitalic);
            }
        } );
        capital.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setFont(fontcapital);
            }
        });
        small.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           result.setFont(fontsmall);
            }
        });
        
        frame.add(plain);
        frame.add(bold);
        frame.add(italic);
        frame.add(capital);
        frame.add(small);
        frame.add(result);
        frame.setVisible(true);
    }
    
    
}