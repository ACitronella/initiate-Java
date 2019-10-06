/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author User
 */
public class OOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculation call = new Calculation();
        
        System.out.println("10 + 5 = "+ call.addition(10, 5));//double a = call,addition(10,5);  a =15
        double b = call.subtraction(10, 5);
        System.out.println("10 - 5 = "+b);
        theNewCalculation cal2 = new theNewCalculation();
        System.out.println("2 + 5 = "+cal2.addition(2, 5));
        System.out.println("2 - 5 = "+cal2.subtraction(2,5));
        System.out.println("2 * 5 = "+cal2.multiplication(2, 5));
        System.out.println("2 / 5 = "+cal2.division(2, 5));
    }
    
}
