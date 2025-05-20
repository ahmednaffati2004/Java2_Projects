/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JApplet;

/**
 *
 * @author manf2
 */
public class NewJApplet extends JApplet {

    @Override
    public void init() {
        
        setSize(700, 600);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 700, 600);
        for (int i = 0; i < 20; i++) {
            g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            g.setFont(new Font(Font.DIALOG, (int) (Math.random() * 3), (int) (Math.random() * 20) + 20));
            g.drawString("I Will Pass The Exam!", (int) (Math.random() * 600), (int) (Math.random() * 600));

        }
    }

}
