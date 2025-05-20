/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JList;


/**
 *
 * @author HP
 */
public class MyFrame6 extends JFrame implements MouseListener{

    int x = 0;
    int y = 0;
    
    MyFrame6()
    {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Rectangle");
        //setType(Type.UTILITY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addMouseListener(this);
        
        setVisible(true);
    }
  
    @Override
    public void paint(Graphics g)
    {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        
        if(x > 0 && y > 0)
        {
        g2d.setStroke(new BasicStroke(4));
        g2d.drawRect(x, y, 40, 40);            
        }
    }

          @Override
          public void mouseClicked(MouseEvent me) {
             x = me.getX();
             y = me.getY();
             repaint();
          }

          @Override
          public void mousePressed(MouseEvent me) {
               //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void mouseReleased(MouseEvent me) {
               // To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void mouseEntered(MouseEvent me) {
              //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void mouseExited(MouseEvent me) {
               //To change body of generated methods, choose Tools | Templates.
          }
      
  
    public static void main(String[] args) {
        new MyFrame6();
    }

} 