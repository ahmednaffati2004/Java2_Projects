/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forfun;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class Forfun  extends JFrame{
    
    public Forfun(){
        
        //frame stuff
        setSize(600, 600);
        setLayout(new BorderLayout(10,10));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setType(Type.UTILITY);
        
        
        
        //panel stuff
        JPanel panel1 = new  JPanel();
        JPanel panel2 = new  JPanel();
        JPanel panel3 = new  JPanel();
        JPanel panel4 = new  JPanel();
        JPanel panel5 = new  JPanel();
        
        
        //panel size
        panel1. setPreferredSize (new Dimension (100,100));
        panel2. setPreferredSize (new Dimension (100,100));
        panel3. setPreferredSize (new Dimension (100,100));
        panel4. setPreferredSize (new Dimension (100,100));
        panel5. setPreferredSize (new Dimension (100,100));
        
        
        //panel color
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.CYAN);
        panel5.setBackground(Color.blue);
        
        
        
        //----------------- sub panel -------------------------
        
        
         //panel stuff
        JPanel panel6 = new  JPanel();
        JPanel panel7 = new  JPanel();
        JPanel panel8 = new  JPanel();
        JPanel panel9 = new  JPanel();
        JPanel panel10 = new  JPanel();
        
        panel5.setLayout(new BorderLayout());
        //panel size
        panel6. setPreferredSize (new Dimension (50,50));
        panel7. setPreferredSize (new Dimension (50,50));
        panel8. setPreferredSize (new Dimension (50,50));
        panel9. setPreferredSize (new Dimension (50,50));
        panel10. setPreferredSize (new Dimension (50,50));
        
        
        //panel color
        panel6.setBackground(Color.black); 
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.LIGHT_GRAY);
        panel10.setBackground (Color.white);
        
        //add stuff
        
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);
        
        
        
        //----------------- sub panel -------------------------
        
        //add stuff
        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.WEST);
        add(panel3,BorderLayout.EAST);
        add(panel4,BorderLayout.SOUTH);
        add(panel5,BorderLayout.CENTER);
        
    }

    public static void main(String[] args) {
       
       Forfun frame = new Forfun() ;
       frame.setVisible(true);
    }
}
