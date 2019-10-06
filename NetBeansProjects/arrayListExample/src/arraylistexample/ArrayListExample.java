/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayList list = new ArrayList();
        list.add(1);
        list.add("dadaw");
        list.add("asdad5yhb");

        System.out.println(list.get(1));*/
        example();
    }
    
    private static void example(){
        int i,o;
        String s;
        Scanner scn = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();//ใส่เป็นclassไปได้
        
        do{
            System.out.println("please select\n1.to add\n2.to clear\n3.to show\n4.to exit" );
            
            i=scn.nextInt();
            if(i==1){
                s = scn.next(); 
                list.add(s);
                
            }
            else if(i==2){
                list.clear();
                System.out.println("list clear complete");
            }
            else if(i==3){
                System.out.println("which order do you want");
                o=scn.nextInt();
                System.out.println(list.get(o)+"\n");
            }
            else if(i==4){}
            else{System.out.println("invalid input");}
        }while(i!=4);
    }
    private static void example2(){
        ArrayList<customer> list = new ArrayList();
        //customer cus1 = new customer();
        //list.add(cus1);
        list.add(new customer("A"));
        
        System.out.println(list.get(0).getName());
    }
}
