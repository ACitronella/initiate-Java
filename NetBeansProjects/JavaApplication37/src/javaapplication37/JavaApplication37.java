/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JavaApplication37 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] customerProducts = new String[5];
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<5;i++) {customerProducts[i] = scn.nextLine();}
        foundProduct(customerProducts);//เอาค่า "customerProducts" ไปแทนใน "CustomerProducts"
    }
    private static void foundProduct(String[] CustomerProducts){
        List products = Arrays.asList(new String[]{"Apple","Hamberger","Fish"});
        for(int i=0;i<CustomerProducts.length;i++){
            if(products.contains(CustomerProducts[i])){
                System.out.println("Found ! "+ CustomerProducts[i]);
            }
            else{
                System.out.println("Not found " + CustomerProducts[i]);
            }
        }
    }
}
