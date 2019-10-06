/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mulitithreading;

/**
 *
 * @author User
 */
public class MulitiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RunnableDemo run1 = new RunnableDemo("Thread 1");
        run1.start();
        RunnableDemo run2 = new RunnableDemo("Thread 2");
        run2.start();
        RunnableDemo run3 = new RunnableDemo("Thread 3");
        run3.start();
        RunnableDemo run4 = new RunnableDemo("Thread 4");
        run4.start();
    }
    
}
