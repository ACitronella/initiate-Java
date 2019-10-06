/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author User
 */
public class IOApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Read : " + readFile("C:\\Users\\User\\Desktop\\test.txt"));
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
        String text = "";
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
}
