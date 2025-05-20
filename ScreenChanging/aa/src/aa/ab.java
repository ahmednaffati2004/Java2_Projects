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
public class ab extends Thread{
    
    @Override
    public void run()
    {
           for(int i = 10; i >= 0; i--)
        {
            System.out.println("Thread 2#: " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread 2 is finshed");
    }
}
