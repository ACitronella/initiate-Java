/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mulitithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class RunnableDemo implements Runnable {
    private String threadName;
    private Thread t;
    @Override
    public void run() {
        System.out.println("Running : "+threadName);
        for(int i=4;i>=0;i--){
            System.out.println(threadName+" : "+i);
            
        }
    }
    
    RunnableDemo(String name){//constructor
        threadName = name;
        System.out.println("Creating : "+threadName);
    }
    
    public void start(){
        System.out.println("Starting : "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

