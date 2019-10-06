/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class OOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Human human1 = new Human();
        human1.setName("Dio");//Called "Argument"
        human1.setlastName("Brando");
        System.out.println(human1.getName()+" "+human1.getlastName());
        
        Human human2 = new Human();
        human2.setName("Jonathan");
        human2.setlastName("Joestar");
        System.out.println(human2.getName()+" "+human2.getlastName());
            
    }
    public static void hello(String name, String lastname, int i){//Called "Parameter"
        name = "A";
        System.out.println("GD "+name+" "+lastname +" "+ i);
    }
    
    
}
