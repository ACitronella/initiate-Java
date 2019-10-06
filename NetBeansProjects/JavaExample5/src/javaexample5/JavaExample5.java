/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample5;

/**
 *
 * @author User
 */
public class JavaExample5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x ="94";
        String y ="12";
        int xi = Integer.parseInt(x);
        int yi = Integer.parseInt(y);
        System.out.println(xi+yi);
        
        x = "652";
        xi = Integer.parseInt(x);
        System.out.println(xi+yi);
        
        System.out.println(Integer.parseInt("10")-Integer.parseInt("8"));
        int d = (int)50.5;
        System.out.println(x + "+" +y + xi+yi );
    }
    
}
