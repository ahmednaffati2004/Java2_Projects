/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

/**
 *
 * @author HP
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() 
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Thread 1#: " + i);
            
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            
        }
        System.out.println("Thread 1 is finshed");
    }
    
}
