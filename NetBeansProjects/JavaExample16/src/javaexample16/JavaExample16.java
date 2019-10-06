/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample16;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaExample16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username = "Admin";
        String password = "Admin";
        Scanner scn = new Scanner(System.in);
        String usernameInput = scn.nextLine();
        String passwordInput = scn.nextLine();
        
        if(username.equals(usernameInput) && password.equals(passwordInput)){
             
                 System.out.println("Hello World");
             
        }
    }
    
}
