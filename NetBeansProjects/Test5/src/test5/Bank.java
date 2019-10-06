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

public class Bank {
    private int Balance = 0;
    Scanner scn = new Scanner(System.in);
    
    public void inCome() {
        System.out.println("Input Money");
        int inputMoney = scn.nextInt();
        Balance = Balance + inputMoney;
        System.out.println("Now your Balance is "+Balance);
        
    }
    
    public void checkBalance(){
        System.out.println(Balance);
    }
    
    public void withDraw() {
        System.out.println("Input Money");
        int inputMoney = scn.nextInt();
        if (inputMoney < Balance){
            System.out.println("Error : Not Enough Money");
        }
        
        else{
            System.out.println("Successes");
        }
    }
    
}
