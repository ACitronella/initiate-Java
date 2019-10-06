/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Arrays;
import java.util.Scanner;
import java.util.GregorianCalendar;
/**
 *
 * @author User
 */

public class Factorial {
public static Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long start = new GregorianCalendar().getTimeInMillis();
	    long startMemory = Runtime.getRuntime().freeMemory();
        int aa[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(aa, 9)));
        
        long end = new GregorianCalendar().getTimeInMillis();
	    long endMemory = Runtime.getRuntime().freeMemory();
	    System.out.println("Time Taken:"+(end - start));
	    System.out.println("Memory used:"+(startMemory - endMemory));
       
    }
    public static double loopF(double n){   
        double A = 1;
        for (int i = 1; i <= n ; i++ ){
            A = A*i;
        }
        return A;
    }
    public static double recursionF(double target){
        if(target == 1){
            return 1;
        }
        return target*recursionF(target-1);
    }
    public static double recursionFi(int n){
        if(n > 2){
            return recursionFi(n-1) + recursionFi(n-2);
        }
        return 1;
    }
    public static double loopFi(int n){
        if(n <= 2){
            return 1;
        }
        double s1 = 1, s2 = 1, s3 = 1;
        for(int i = 2; i < n; i++){
            s3 = s1 + s2;
            s1 = s2;
            s2 = s3;
        }
        return s3;
    }
    
}
