/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basenumber;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class BaseNumber {
static Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(;;){
            System.out.println("Which base do you want to convert from decimal(2-36): ");
            int baseNumber = scn.nextInt();
        
            if(baseNumber>1&&baseNumber<=36){
                System.out.println("Insert Decimal that you want to convert to "+baseNumber+" base");
                long i = scn.nextLong();
                if(i<0){
                    i*=-1;
                    System.out.println("Result is: -"+resultinBase(baseNumber,i)+" base "+baseNumber);
                }
                else{
                    System.out.println("Result is: "+resultinBase(baseNumber,i)+" base "+baseNumber);
                }       
            }
            else if(baseNumber==0){
                break;
            }   
            else{
                System.out.println("Invalid Input");
            }
        }
                
    }
    
    public static StringBuilder resultinBase(int baseNumber,long i){//baseNumber คือเลขฐาน  i คือเลขฐาน 10
        
        StringBuilder output = new StringBuilder();
        int h;       
        char j = 0;
        while(i>0){
            if(baseNumber<=10){
                h = (int) (i%baseNumber);
                i = i/baseNumber;
                output.append(h);
            }
            else if(baseNumber>10){
                h = (int) (i%baseNumber);
                i = i/baseNumber;
                if(h>=10){
                    switch (h) {
                        case 10:                        
                            j = 'A';
                            break;
                        case 11:                       
                            j = 'B';
                            break;
                        case 12:                        
                            j = 'C';
                            break;
                        case 13:
                            j = 'D';
                            break;
                        case 14:
                            j = 'E';
                            break;
                        case 15:
                            j = 'F';
                            break;
                        case 16:
                            j = 'G';
                            break;
                        case 17:
                            j = 'H';
                            break;
                        case 18:
                            j = 'I';
                            break;
                        case 19:
                            j = 'J';
                            break;
                        case 20:
                            j = 'K';
                            break;
                        case 21:
                            j = 'L';
                            break;
                        case 22:
                            j = 'M';
                            break;
                        case 23:
                            j = 'N';
                            break;
                        case 24:
                            j = 'O';
                            break;
                        case 25:
                            j = 'P';
                            break;
                        case 26:
                            j = 'Q';
                            break;
                        case 27:
                            j = 'R';
                            break;
                        case 28:
                            j = 'S';
                            break;
                        case 29:
                            j = 'T';
                            break;
                        case 30:
                            j = 'U';
                            break;
                        case 31:
                            j = 'V';
                            break;
                        case 32:
                            j = 'W';
                            break;
                        case 33:
                            j = 'X';
                            break;
                        case 34:
                            j = 'Y';
                            break;
                        case 35:
                            j = 'Z';
                            break;
                    }
                    output.append(j);
                }
                else if(h<10){
                    output.append(h);
                }
            }
            
        } 
        
        output.reverse();
        return output;
    }
    public static void convertDeci(){
        System.out.println("Which base do you want to convert from decimal(2-36): ");
        int baseNumber = scn.nextInt();
        
        if(baseNumber>1&&baseNumber<=36){
            System.out.println("Insert Decimal that you want to convert to "+baseNumber+" base");
            long i = scn.nextLong();
            if(i<0){
                i*=-1;
                System.out.println("Result is: -"+resultinBase(baseNumber,i)+" base "+baseNumber);
            }
            else{
                System.out.println("Result is: "+resultinBase(baseNumber,i)+" base "+baseNumber);
            }       
        }
        else if(baseNumber==0){
            
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public static StringBuilder resultinDeci(){
        StringBuilder output = new StringBuilder();
        double inputDouble = scn.nextDouble();
        
        return output;
    }
}

    


