/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author manf2
 */
public class NewApplet extends Applet implements ActionListener{

    
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    
    public void init() {
        setSize(600 , 600);
        setLayout(new FlowLayout());
        btn1 = new JButton("Red");
        btn2 = new JButton("Blue");
        btn3 = new JButton("Green");
        btn4 = new JButton("White");
        btn5 = new JButton("Black");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btn1){
                    setBackground(Color.red);
                } else if(ae.getSource() == btn2){
                    setBackground(Color.blue);
                }else if(ae.getSource() == btn3){
                    setBackground(Color.green);
                }else if(ae.getSource() == btn4){
                    setBackground(Color.white);
                }else if(ae.getSource() == btn5){
                    setBackground(Color.black);
                }
    }
   
}
