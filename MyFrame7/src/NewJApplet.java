/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JApplet;

/**
 *
 * @author manf2
 */
public class NewJApplet extends JApplet implements MouseListener{

    int x , y ;
    int counter = 0;
    
    public void init() {
    setSize(600 , 600);
    addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g) {
       if(x>0 && y>0){
       g.setColor(Color.black);
       g.fillOval(x, y, 40, 40);
       } 
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        if(counter == 10){
            System.out.println("To Many Spots");
        } else{
        counter++;
        x = me.getX();
        y = me.getY();
        repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
}
