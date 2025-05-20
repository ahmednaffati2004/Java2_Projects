/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice6;

import java.awt.MenuBar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author manf2
 */
public class Practice6 extends JFrame {

    JMenuBar mb;
    JMenu m1, m2, m3;
    JMenuItem item1, item2 , item3 , item4;
    ImageIcon img1 , img2 ,img3 ,img4;
    Practice6() {
        super("JMenuBar Demo");
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("Help");
        
        img1 = new ImageIcon("images\\new-file.png");
        img2 = new ImageIcon("images\\open-icon.png");
        img3 = new ImageIcon("images\\save-icon.png");
        img4 = new ImageIcon("images\\exit-icon.png");
        
        item1 = new JMenuItem("new" , img1);
        item2 = new JMenuItem("open" , img2);
        item3 = new JMenuItem("save" , img3);
        item4 = new JMenuItem("exit" , img4);
        
        
        m1.add(item1);
        m1.add(item2);
        m1.add(item3);
        m1.add(item4);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        setSize(450, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
    }

    public static void main(String[] args) {
        new Practice6().setVisible(true);
    }
    
}
