/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaExample10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int money = scn.nextInt();
        if(money >= 200){
            System.out.println("Krapao+Cola+Snack");
        }
        else if(money >= 100){  //if
            System.out.println("Krapao+Cola");
        }
        else if(money >= 50){   //if
            System.out.println("Krapao");
        }
        else{
            System.out.println("-");
        }
    }
    
}
