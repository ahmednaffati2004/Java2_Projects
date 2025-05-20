package screenchanging;

import java.awt.Color;
import java.awt.Font;

public class MessagesAnimation extends Thread
{
    private int counter;
    private MyFrame framm; 
    private String messages[] = {"We", "Are","Engineers" };
    
    MessagesAnimation(MyFrame fr)
    {
        this.framm = fr ;
    }
    @Override
    public void run()
    {
        while(true)
        {
            
            displayMessages();
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread Interrupted");
            }
        }
    }
    public void displayMessages()
    {
        Font font = new Font("Time Roman", Font.BOLD, 5 * counter + 20);
        
        framm.labelMessages.setFont(font);
        framm.labelMessages.setText(messages[counter]);
        framm.labelMessages.setForeground(Color.BLUE);
       
        framm.panelMessages.setBackground(new Color(counter * 120, counter * 80, counter*50));
        
        counter++;
        
        if(counter > 2)
        {
            counter = 0;
        }
    }
}