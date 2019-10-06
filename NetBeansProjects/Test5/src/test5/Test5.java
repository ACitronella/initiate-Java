/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Test5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insert \"inCome\" , \"withDraw\" , \"checkBalance\"");
        Scanner scn = new Scanner(System.in);
        String Function = scn.nextLine();
        Bank firstBank = new Bank();
        
        switch (Function) {
            case "inCome":
                firstBank.inCome();
                break;
            case "withDraw":
                firstBank.withDraw();
                break;
            case "checkBalance":
                firstBank.checkBalance();
                break;
            default:
                System.out.println("Error : Out of case");
                break;
        }
    }
    
        
    
}
