/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yellowbackgraound_hw2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author manf2
 */
public class YellowBackGraound_hw2 extends JFrame {
    
    YellowBackGraound_hw2() {
        
        Container con = getContentPane();
        
        
        
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        con.setBackground(Color.yellow);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new YellowBackGraound_hw2();
    }
    
}
