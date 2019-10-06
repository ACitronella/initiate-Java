/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionproject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExceptionProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner scn = new Scanner(System.in);
        scn.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
        
    }
    
}
