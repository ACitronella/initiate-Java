/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testn;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class TestN {
static String alphabet = "abcdefghijklmnopqrstuvwxyz ";
static Scanner scn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(reverseCase("String str"));
        
    }
    public static int numOfCus(){
        System.out.println("Enter Your Number of Customer :");
        return scn.nextInt();
    }
    public static void setCus(int i){
        ArrayList<Cus> list = new ArrayList();
        Cus temp = new Cus();
        String a;
        System.out.println("Enter First Name and Last Name :");
        
        for(int h = 0;h < i; h++){
            a = scn.nextLine();
            temp.setname(a);
            list.add(temp);
        }
        System.out.println(list.get(0).getname());
    }
    public static void output(){
        System.out.println("");
    }
    public static String enNDeCode(String input, int shifted){
        input = input.toLowerCase();
        StringBuilder process = new StringBuilder(input);
        int len = input.length(), temp;
        for (int i = 0; i < len; i++){
            temp = (alphabet.indexOf(input.charAt(i)) + shifted) % 27;
            if(temp < 0){
                temp = 27 + temp;
            }
            process.setCharAt(i, alphabet.charAt(temp));
        }  
        return process.toString();  
    }
    private static void writeFile(String str){
        try{
            FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\test.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            System.out.println("Create file complete");
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        
    }
    private static String readFile(String file){
        String text = "" ;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp;
            while((temp = br.readLine())!= null){
                text += temp;
            }
        } 
        catch (IOException ex) {
            
        }
        
        return text;
    }
    public static String reverseCase(String str) {
		char[] temp = str.toCharArray();
		int l = str.length();
		for(int i = 0; i < l; i++){
			if(temp[i] >= 'A' && temp[i] <= 'Z'){
				temp[i] = Character.toLowerCase(temp[i]);
            }
			else if(temp[i] >= 'a' && temp[i] <= 'z'){
				temp[i] = Character.toUpperCase(temp[i]);
			}
        }
        String s = String.valueOf(temp);
		return s;
    }
}
