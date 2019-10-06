/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample14;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JavaExample14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Password = "1234";
        String inputPassword;
        do
        {
            Scanner scn = new Scanner(System.in);
            inputPassword = scn.nextLine();
        }
        while(!Password.equals(inputPassword));
        {
            System.out.println("HelloWorld");
        }
        System.out.println("HelloWorld2");
    }
    
}
