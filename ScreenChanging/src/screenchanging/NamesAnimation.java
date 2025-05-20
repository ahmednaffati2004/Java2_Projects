package screenchanging;

import java.awt.Color;
import java.awt.Font;

public class NamesAnimation implements Runnable
{
    int counter;
    Thread myThrd = new Thread(this);
    
    MyFrame frm; 
    String names[] = {"Ahamed", "Abobaker","Marwoo" };
    
    public NamesAnimation(MyFrame frm)
    {
        this.frm = frm ;
    }
    @Override
    public void run()
    {
        while(true)
        {
            displayNames();
            try
            {
                myThrd.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread Interrupted");
            }
        }
    }
    public void displayNames()
    {
        Font myFont = new Font("Time Roman", Font.BOLD, 5 * counter + 20);
        
        frm.labelNames.setFont(myFont);
        frm.labelNames.setText(names[counter]);
        frm.labelNames.setForeground( Color.red);
        
        frm.panelNames.setBackground(new Color(counter * 50, counter * 120, counter*100));
        
        counter++;
        if(counter > 2)
        {
            counter = 0;
        }
    }
}
