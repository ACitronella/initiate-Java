/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int [] a = new int [10];
        //a[0] = 5;
        
        double[] d = {5.3, 3.56, 0.5, 1.65, 7.8};
        Arrays.sort(d);
        for(int i=4; i>=0; i--) {
            System.out.print(d[i]+ " ");
        }
        
        int x = 5;
        x++;
        System.out.println(x);
        
    }
    
}
