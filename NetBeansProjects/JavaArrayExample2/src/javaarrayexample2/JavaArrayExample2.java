/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrayexample2;

/**
 *
 * @author User
 */
public class JavaArrayExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] customerList = {10,20,30,40,50,60};
        customerList[0] = 5; 
        
        String [][] CustomerList = new String [10][5];
        CustomerList[0][0] = "Sommai";
        CustomerList[0][1] = "Jaa";
        CustomerList[0][2] = "45";
        CustomerList[0][3] = "Thailand";
        
        CustomerList[1][0] = "Sommee";
        CustomerList[1][1] = "Jaa";
        CustomerList[1][2] = "41";
        CustomerList[1][3] = "Thailand";
        System.out.print(CustomerList[1][0]+CustomerList[1][1] );
    }
    
}
