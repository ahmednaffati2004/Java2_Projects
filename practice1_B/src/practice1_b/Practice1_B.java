/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1_b;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author manf2
 */
public class Practice1_B extends JFrame {

    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;
    DefaultListModel model1;
    DefaultListModel model2;
    JList list1;
    JList list2;
    JScrollPane scr1;
    JScrollPane scr2;
    JButton btn2;
    JButton btn1;
    JButton btn3;
    JTextField tf;

    Practice1_B() {
        super("JList Demo");
        lbl1 = new JLabel("Select Language");
        lbl2 = new JLabel("Select Level");
        lbl3 = new JLabel("", JLabel.CENTER);
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();

        list1 = new JList(model1);
        list2 = new JList(model2);

        scr1 = new JScrollPane(list1);
        scr2 = new JScrollPane(list2);

        btn1 = new JButton("View Selected");
        btn2 = new JButton("Add Subject");
        btn3 = new JButton("Remove Subject");

        tf = new JTextField();

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

        btn1.setBounds(400, 360, 120, 30);
        btn2.setBounds(60, 360, 120, 30);
        btn3.setBounds(200, 360, 150, 30);
        lbl3.setBounds(100, 500, 350, 30);
        tf.setBounds(60, 420, 180, 30);
        add(lbl1);
        add(lbl2);
        add(scr1);
        add(scr2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(lbl3);
        add(tf);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                lbl3.setText("You Select : " + " " + list1.getSelectedValue() + "[" + list2.getSelectedValue() + "]");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                model1.addElement(tf.getText());
                tf.setText("");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                model1.removeElement(list1.getSelectedValue());
                tf.setText("");
            }
        });
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {

                if (ke.getKeyChar() == KeyEvent.VK_ENTER) {
                    model1.addElement(tf.getText());
                    tf.setText("");
                }

            }
        });
    }

    public static void main(String[] args) {
        new Practice1_B().setVisible(true);
    }

}
