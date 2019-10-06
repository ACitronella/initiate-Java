/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample9;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class JavaExample9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        d();
    }
    public static void d(){
        Scanner A = new Scanner(System.in);
        int M = A.nextInt();
        A.nextLine();
        int D = A.nextInt();
        if(M>D)
        {
            if(M >= 220 )
            System.out.println("Hello World");
        }
        if( M >=1020)
        {
            System.out.println("s");
        }
        else
        {
            System.out.println("a");
        }
    }
    
}