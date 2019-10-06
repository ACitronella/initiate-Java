/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author User
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           float x = 6.28f;
           x = (float) (1.0+1.0/x);
           System.out.print(x);
       
    }
    public static void setcus(int Customer){
        Scanner scn = new Scanner(System.in);
        String[] Name = new String [Customer];
        int[] Year = new int [Customer];
        String[] Gender = new String [Customer];
        for(int i=0;i<Customer;i++){
            System.out.println("Enter First Name and Last Name");
            String A = scn.next()+" "+scn.next();
            System.out.println("Enter Your Birth Year");
            int B = scn.nextInt();
            System.out.println("Enter Your Gender");
            String C = scn.next();
            Name[i] = A;
            Year[i] = B;
            Gender[i] = C; 
        }
        System.out.println("--Customers Information--");
        for(int h=0;h<Customer;h++){
            System.out.println(Name[h]+" "+"(age : "+(2017-Year[h])+")\nGender : "+Gender[h]);

        }
    }
    public static void start(){
        System.out.println("Enter Your Number of Customer");
        Scanner scn = new Scanner(System.in);
        try{
            int Customer = scn.nextInt();
            setcus(Customer);
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    
    }
    public static void groceryC(){
        int price=0,pay=0;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Please enter the price of goods: ");
        try{
        price = scn.nextInt();
        System.out.println("Please enter the money to pay:");
        pay = scn.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
        if(price<pay){
            System.out.println("Change amount : "+(pay-price));
            pay = pay-price;
            System.out.println("1000 Baht :"+pay/1000);
            pay = pay%1000;
            System.out.println("500 Baht : "+pay/500);
            pay = pay%500;
            System.out.println("100 Baht : "+pay/100);
            pay = pay%100;
            System.out.println("50 Baht : "+pay/50);
            pay = pay%50;
            System.out.println("20 Baht : "+pay/20);
            pay = pay%20;
            System.out.println("10 Baht : "+pay/10);
            pay = pay%10;
            System.out.println("5 Baht : "+pay/5);
            pay = pay%5;
            System.out.println("2 Baht : "+pay/2);
            pay = pay%2;
            System.out.println("1 Baht : "+pay/1);
        }
        else{
            System.out.println("Price can't less than pay");
        }
    }
    public static void groceryTF(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the price of goods : ");
        int price = scn.nextInt();
        System.out.print("Please enter the money to pay :");
        int pay = scn.nextInt();
        int change = pay - price;
        System.out.println("Change amount : "+change);
        
        if(change>=1000){
            System.out.println("1000 Baht : "+change/1000);
            change = change%1000;
        }
        
        if(change>=500){
            System.out.println("500 Baht : "+change/500);
            change = change%500;
        }
        
        if(change>=100){
            System.out.println("100 Baht : "+change/100);
            change = change%100;
        }
        
        if(change>=50){
            System.out.println("50 Baht : "+change/50);
            change = change%50;
        }
        
        if(change>=20){
            System.out.println("20 Baht : "+change/20);
            change = change%20;
        }
        
        if(change>=10){
            System.out.println("10 Baht : "+change/10);
            change = change%10;
        }
        
        if(change>=5){
            System.out.println("5 Baht : "+change/5);
            change = change%5;
        }
        
        if(change>=2){
            System.out.println("500 Baht : "+change/2);
            change = change%2;
        }
        
        if(change>=1){
            System.out.println("1 Baht : "+change/1);
        }
        
        if(change<0){
            System.out.println("Price can't less than pay");
        }
    }
    public static void py(){
         Scanner scn = new Scanner(System.in);
         int i = scn.nextInt();
         if(i>0){
             System.out.println("yes");
         }
         else{
             System.out.println("no");
         }
    }
    public static void randomshit(){
        int[] random = new int[100];
        Set<Integer> set = new HashSet();
        
        for(int i=0;i<100;i++){
            random[i] = (int )(Math.random() * 100 + 1);
            set.add(random[i]);
            System.out.print(random[i]+" ");
        }
        
        System.out.println("\n"+set);
        System.out.println(set.size());

    }
}

    