
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.powers.of.a.numbers;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ThePowersOfANumbers {

    /**
     * @param args the command line arguments
     */
    static Scanner scn;
    public static void main(String[] args) {
        // TODO code application logic here
        
        dd();
    }
    public static int process(){
        scn = new Scanner(System.in);
        int input1 = scn.nextInt();
        int input2 = scn.nextInt();
        int output = 1;
        
        for(int i=0;i<input2;i++){
            output = input1*output;
        }
        return output;
    }
    public static void d(){
        for (int i = 1; i < 10000; i++) {

            if (i % 2 ==0) {

                if (i % 3 ==0) {

                    if (i % 4 ==0) {

                        if (i % 5 ==0) {

                            if (i % 6 ==0) {

                                if (i % 7 ==0) {

                                    if (i % 8 ==0) {

                                        if (i % 9 ==0) {

                                            System.out.println(i);

                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void dd(){
        for(int i = 100;i<10000;i++){
            if(i%(5*7*8*9)==0){
                System.out.println(i);
                
            }
        }
            
    }
}

