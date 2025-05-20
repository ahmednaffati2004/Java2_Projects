/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author manf2
 */
public class Practice1 extends JFrame implements ActionListener{

    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;
    DefaultListModel model1;
    DefaultListModel model2;
    JList list1;
    JList list2;
    JScrollPane scr1;
    JScrollPane scr2;
    JButton btn1;

    Practice1() {
        super("JList Demo");
        lbl1 = new JLabel("Select Language");
        lbl2 = new JLabel("Select Level");
        lbl3 = new JLabel("" , JLabel.CENTER);
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
        
        list1 = new JList(model1);
        list2 = new JList(model2);
        
        scr1 = new JScrollPane(list1);
        scr2 = new JScrollPane(list2);
        
        btn1 = new JButton("View Selected");
        model1.addElement("Java");
        model1.addElement("C");
        model1.addElement("C++");
        model1.addElement("C#");
        model1.addElement("Visual_B");
        
        model2.addElement("Beginner");
        model2.addElement("intermediate");
        model2.addElement("professional");
        
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lbl1.setBounds(60, 40, 100, 100);
        lbl2.setBounds(400, 40, 100, 100);
        
        scr1.setBounds(60, 120, 170, 200);
        scr2.setBounds(370, 120, 170, 200);
        
        btn1.setBounds(240, 360, 120, 40);
        lbl3.setBounds(100, 500, 350, 30);
        
        add(lbl1);
        add(lbl2);
        add(scr1);
        add(scr2);
        add(btn1);
        add(lbl3);
        btn1.addActionListener(this);
    }

    public static void main(String[] args) {
        new Practice1().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    lbl3.setText("You Select : " + " " + list1.getSelectedValue() + "[" + list2.getSelectedValue() + "]");
    }
    
}
