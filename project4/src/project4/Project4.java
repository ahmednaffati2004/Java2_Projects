/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author manf2
 */
public class Project4 extends JFrame implements KeyListener{
    
    JTextArea textA;
    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;

    Project4() {
        super("JTextArea Demo");
        textA = new JTextArea();
        lbl1 = new JLabel("line : ");
        lbl2 = new JLabel("Char : ");
        lbl3 = new JLabel("Words : ");
        
        setSize(400, 460);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        textA.setBounds(20, 20, 330, 280);
        lbl1.setBounds(20, 310, 100, 100);
        lbl2.setBounds(120, 310, 100, 100);
        lbl3.setBounds(220, 310, 100, 100);
        
        textA.addKeyListener(this);
        add(textA);
        add(lbl1);
        add(lbl2);
        add(lbl3);
    }
    
    public static void main(String[] args) {
        new Project4().setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) { 
    lbl1.setText("line : " + textA.getLineCount());
    lbl2.setText("Char : " + textA.getText().length());
    lbl3.setText("Words : " + getWordsCount(textA.getText()));
    }
    public static int getWordsCount(String text){
    int wordsCount = 0;
    
    String [] txt = text.trim().split("\\s+");
    wordsCount = txt.length;
    return wordsCount;
    }
    
}
