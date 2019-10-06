/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JavaExample1 {
     public static Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = scn.nextInt();
        System.out.println(sigma(x));
    }
   
    public static void pmain(){
        System.out.println("**                 *************         *******           ***********");
        System.out.println("**                 *************        **     **          ***********");
        System.out.println("**                 **         **       ***      ***            ***");
        System.out.println("************       **         **       **        **            ***");
        System.out.println("**        **       **         **       ************            ***");
        System.out.println("**        **       **         **       **        **            ***");
        System.out.println("**        **       *************       **        **            ***");
        System.out.println("************       *************       **        **            ***");
    }
    
    public static int sigma(int n){
        return n*(n+1)/2;
    }
    public static void a(){
        
        for(int x=0;x<4;x++){
            for(int y=x;y<4;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void b(){
        scn = new Scanner(System.in);
        int A[][]=new int[3][3],temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        System.out.println("The transpose of input array = ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%-5d",A[i][j]);
            }
            System.out.println();
        }
    }
    
    
}

