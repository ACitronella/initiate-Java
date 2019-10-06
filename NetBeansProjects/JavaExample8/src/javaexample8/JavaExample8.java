/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaExample8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("input money");
        Scanner S = new Scanner(System.in);
        double d = S.nextDouble();
        double x = 35;
        double r = d*x;
        System.out.println(r+"THB");
                
        
    }
    
}
