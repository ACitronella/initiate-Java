/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample11;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JavaExample11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Input Food type : ");
        Scanner scn = new Scanner(System.in);
        String inputFoodtype = scn.nextLine();
        System.out.print("Input Flavor : ");
        String inputFlavor = scn.nextLine();
        
        if("Thai".equals(inputFoodtype)){
            if(!"Spicy".equals(inputFlavor))if("Salty".equals(inputFlavor)){
                System.out.println("Fried pork");
            }
            else{
                System.out.println("Pad Thai");
            }
            else{
                System.out.println("Tom yum");
            }
        }
        else if(inputFoodtype.equals("American")){
            
            if(inputFlavor.equals("Salty")){
                System.out.println("French fries");
            }
            else{
                System.out.println("Pizza");
            }
        }
    }
    
}
