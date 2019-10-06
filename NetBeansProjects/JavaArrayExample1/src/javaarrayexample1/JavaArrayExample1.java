/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrayexample1;

/**
 *
 * @author User
 */
public class JavaArrayExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] price = new int[10];

        for(int i=0; i<10;i++ ){
            price[i] = 5+(i*5);//5*(i+1)
        }
        for(int i=0; i<10;i++ ){
            System.out.println(price[i]);
        }
    }
    
}
