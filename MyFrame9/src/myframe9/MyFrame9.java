package myframe9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MyFrame9 extends JFrame implements ItemListener {
    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;
    
    JRadioButton rad1;
    JRadioButton rad2;
    JRadioButton rad3;
    JRadioButton rad4;
    JRadioButton rad5;
    JRadioButton rad6;
    JRadioButton rad7;
    JRadioButton rad8;
    ButtonGroup group1;
    ButtonGroup group2;
    JPanel centerPanel;
    
    JPanel panel1;
    JPanel panel2;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    
    ImageIcon icon1;
    ImageIcon car1;
    ImageIcon car2;
    ImageIcon car3;
    ImageIcon car4;
    ImageIcon car5;
    ImageIcon car6;
    ImageIcon car7;
    ImageIcon car8;

    MyFrame9() {
        super("Cars Demo");
        setSize(650, 950);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));

        icon1 = new ImageIcon("Images\\flower.jpg");
        car1 = new ImageIcon("Images\\Car1.jpg");
        car2 = new ImageIcon("Images\\Car2.jpg");
        car3 = new ImageIcon("Images\\Car3.jpg");
        car4 = new ImageIcon("Images\\Car4.jpg");
        car5 = new ImageIcon("Images\\Car5.jpg");
        car6 = new ImageIcon("Images\\Car6.jpg");
        car7 = new ImageIcon("Images\\Car7.jpg");
        car8 = new ImageIcon("Images\\Car8.jpg");

        lbl1 = new JLabel(icon1);
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        
        centerPanel = new JPanel(new BorderLayout());
        panel1 = new JPanel(new GridLayout(4, 1));
        panel2 = new JPanel(new GridLayout(4, 1));
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();

        rad1 = new JRadioButton("Car1");
        rad2 = new JRadioButton("Car2");
        rad3 = new JRadioButton("Car3");
        rad4 = new JRadioButton("Car4");
        group1 = new ButtonGroup();
        group1.add(rad1);
        group1.add(rad2);
        group1.add(rad3);
        group1.add(rad4);
        
        rad5 = new JRadioButton("Car5");
        rad6 = new JRadioButton("Car6");
        rad7 = new JRadioButton("Car7");
        rad8 = new JRadioButton("Car8");
        group2 = new ButtonGroup();
        group2.add(rad5);
        group2.add(rad6);
        group2.add(rad7);
        group2.add(rad8);
        
        panel1.add(rad1);
        panel1.add(rad2);
        panel1.add(rad3);
        panel1.add(rad4);
        
        panel2.add(rad5);
        panel2.add(rad6);
        panel2.add(rad7);
        panel2.add(rad8);
        
        panel1.setBorder(new TitledBorder(new LineBorder(Color.RED, 2), "USA"));
        
        panel2.setBorder(new TitledBorder(new LineBorder(Color.RED, 2), "Japan"));
        centerPanel.add("East", panel1);
        centerPanel.add("Center", panel6);
        centerPanel.add("West", panel2);

        panel4.add(lbl2);
        panel5.add(lbl3);
        panel6.add(lbl1);
        
        add(panel4);
        add(centerPanel);
        add(panel5);
        
        rad1.addItemListener(this);
        rad2.addItemListener(this);
        rad3.addItemListener(this);
        rad4.addItemListener(this);
        rad5.addItemListener(this);
        rad6.addItemListener(this);
        rad7.addItemListener(this);
        rad8.addItemListener(this);

        
    }

    
    

    

    public static void main(String[] args) {
        new MyFrame9().setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == rad1) {
            lbl2.setIcon(car1);
        } else if (ie.getSource() == rad2) {
            lbl2.setIcon(car2);
        } else if (ie.getSource() == rad3) {
            lbl2.setIcon(car3);
        } else if (ie.getSource() == rad4) {
            lbl2.setIcon(car4);
        }
        if (ie.getSource() == rad5) {
            lbl3.setIcon(car5);
        } else if (ie.getSource() == rad6) {
            lbl3.setIcon(car6);
        } else if (ie.getSource() == rad7) {
            lbl3.setIcon(car7);
        } else if (ie.getSource() == rad8) {
            lbl3.setIcon(car8);
        }
    }
}