/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calculator {
//public Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        function check = new function();
        Scanner scn = new Scanner(System.in);
        String h = scn.nextLine();
        switch(h){
            case "factorial":
                check.factorial();
                break;
                
            case "plus":
                check.plus();
                break;
            case "minus":
                check.minus();
            default:
                
                break;
        }
        
        
    }
     
}
