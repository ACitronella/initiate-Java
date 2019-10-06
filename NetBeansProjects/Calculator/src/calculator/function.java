/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class function {
    Scanner scn = new Scanner(System.in);
    public void plus(){
        int a = 0;
        for(int i = 0;i<99;i++ ){
            int input = scn.nextInt();
            a = input+a;
            System.out.println(a);
        }       
    }
    public void factorial(){
        long a = 1;
        int inputNumber = scn.nextInt();
        for(int i=1;i<=inputNumber;i++){
            a = i*a;
        }
        System.out.println(a);
    }
    public void minus(){
        int a = scn.nextInt();
        for(int i=0;i<99;i++){
            int s = scn.nextInt();
            a = a-s;
            System.out.println(a);
        }
    }
}
