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
public class Aa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().setName("omar");
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().isAlive());

     ab Thread1 = new ab();
     
     MyRunnable myrunnable = new MyRunnable();
     Thread Thread2 = new Thread(myrunnable);
     
     Thread1.start();
     Thread1.join();
     Thread2.start();
     
    }
    
}
