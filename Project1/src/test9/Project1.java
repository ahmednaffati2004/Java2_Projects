/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;




import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author manf2
 */
public class Project1 extends JFrame{
    JPanel panel1;
    
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    
    GridBagConstraints gbc;
    Project1() {
        super("My Frame");
        btn1 = new JButton("button1");
        btn2 = new JButton("button2");
        btn3 = new JButton("button3");
        btn4 = new JButton("button4");
        btn5 = new JButton("button5");
        btn6 = new JButton("button6");
        btn7 = new JButton("button7");
        
        panel1 = new JPanel();
        
        gbc = new GridBagConstraints();
        
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        panel1.setLayout(new GridBagLayout());
        
        
        gbc.fill = GridBagConstraints.BOTH;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        panel1.add(btn1 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel1.add(btn2 , gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btn3 , gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel1.add(btn4 , gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(btn5 , gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btn6 , gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        panel1.add(btn7, gbc);
        add(panel1);
        
    }

    public static void main(String[] args) {
        new Project1().setVisible(true);
    }

}
