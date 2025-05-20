/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframe5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author manf2
 */
public class MyFrame5 extends JFrame implements AdjustmentListener{
    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;
    JLabel lbl4;
    JLabel lbl5;
    JScrollBar scr1;
    JScrollBar scr2;
    JScrollBar scr3;
    
    void setUpFrame(){
    setSize(800 , 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);
    
    }
    MyFrame5(){
    setUpFrame();
    lbl1 = new JLabel("Red");
    lbl2 = new JLabel("Green");
    lbl3 = new JLabel("Blue");
    lbl4 = new JLabel("");
    lbl5 = new JLabel("Color : ");
    scr1 = new JScrollBar(JScrollBar.HORIZONTAL, 32,10,0,265);
    scr2 = new JScrollBar(JScrollBar.HORIZONTAL, 32,10,0,265);
    scr3 = new JScrollBar(JScrollBar.HORIZONTAL, 32,10,0,265);
    
    lbl1.setBounds(60 , 50 , 100 , 100);
    lbl2.setBounds(60 , 120 , 100 , 100);
    lbl3.setBounds(60 , 190 , 100 , 100);
    lbl5.setBounds(550, 220, 200, 100);
    
    lbl4.setBounds(480, 65, 200, 160);
    lbl4.setBackground(Color.yellow);
    lbl4.setOpaque(true);
    scr1.setBounds(120 , 90 , 200 , 20);
    scr2.setBounds(120 , 160 , 200 , 20);
    scr3.setBounds(120 , 230 , 200 , 20);
    
    scr1.setBackground(Color.red);
    scr2.setBackground(Color.green);
    scr3.setBackground(Color.blue);
    
    
    scr1.addAdjustmentListener(this);
    scr2.addAdjustmentListener(this);
    scr3.addAdjustmentListener(this);
    
    
    add(lbl1);
    add(scr1);
    add(lbl2);
    add(scr2);
    add(lbl3);
    add(scr3);
    add(lbl4);
    add(lbl5);
    
    setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
       new MyFrame5();
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        int x = scr1.getValue();
        int y = scr2.getValue();
        int z = scr3.getValue();
        Color color = new Color(x, y, z);
        lbl4.setBackground(color);
        lbl5.setText("Color : " + x +"," +y+ "," + z);
    }
    
}
