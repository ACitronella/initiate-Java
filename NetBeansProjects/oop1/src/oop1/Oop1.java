/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Oop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner scn = new Scanner(System.in);
        Car a1 = new Car();
        a1.start();*/
        
        helloWorld();
        System.out.print(re());
        System.out.print(ab());
        int อีกค่าหนึ่ง = ab();
        
    }
    private static void helloWorld(){
        System.out.println("I'm Gay");
    }
    private static String re(){
        return "Hello World";
    }
    private static int ab(){
        int a = 10;
        int b = 5;
        return a+b;
        
    }
}
