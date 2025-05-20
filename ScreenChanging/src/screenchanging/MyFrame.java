package screenchanging;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame
{
    public JLabel labelNames;
    public JLabel labelMessages;
    public JLabel labelMessages2;
    public JLabel labelNames2;
    
    public JPanel panelNames;
    public JPanel panelMessages;
    public JPanel panelMessages2;
    public JPanel panelNames2;
           
    MyFrame()
    {
        labelNames = new JLabel("");
        labelMessages = new JLabel("");
        labelMessages2 = new JLabel("");
        labelNames2 = new JLabel("");
        
        Container con = getContentPane();
        con.setLayout(new GridLayout(2, 2));
        
        panelNames = new JPanel();
        panelNames.setLayout(new FlowLayout());
        panelNames.add(labelNames);
              
        panelMessages = new JPanel();
        panelMessages.setLayout(new FlowLayout());
        panelMessages.add(labelMessages);
        
        panelMessages2 = new JPanel();
        panelMessages2.setLayout(new FlowLayout());
        panelMessages2.add(labelMessages2);
        
        panelNames2 = new JPanel();
        panelNames2.setLayout(new FlowLayout());
        panelNames2.add(labelNames2);
        
        con.add(panelNames);
        con.add(panelMessages);
        con.add(panelMessages2);
        con.add(panelNames2);
              
        addWindowListener(new WindowAdapter()
        {
             @Override
             public void windowClosing(WindowEvent we)
             {
//                 MyFrame f;
//                 f = (MyFrame)we.getSource(); 
//                 f.dispose();
                 System.exit(0);
             }
        });
        setTitle("Animation");
        setSize(600,200);
        setVisible(true);   
    }
    
    public static void main(String[] args) 
    {
        MyFrame fm = new MyFrame(); 
       
        //NamesAnimation nmAnim = new NamesAnimation(fm);
        //Thread thrd = new Thread(nmAnim);
        
        //Thread thrd = new Thread(new NamesAnimation(fm));
        new Thread(new NamesAnimation(fm)).start();
        
       // MessagesAnimation messTrd = new MessagesAnimation(fm);
        new MessagesAnimation(fm).start();
        
        Thread thrd2 = new Thread(new MESSAGE2(fm));
        new Thread(new MESSAGE2(fm)).start();
        
        Thread thrd3 = new Thread(new Names2(fm));
        new Thread(new Names2(fm)).start();
        //System.out.println(Thread.activeCount());
        while(true)
        {
            System.out.println("I Hope You Get It !!");
        }
    }
}