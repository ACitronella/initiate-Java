/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangui;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Core {
    private String word = "";
    private String brokenString = "";
    public String lostAlphabet = "";
    private int life = 5;
    
    public String getbrokenString(){
        WordList wordList = new WordList();
        word = wordList.getRandonWord();
        brokenString = word;
        /*
        *int noHyphen = random.nextInt(word.length()-3) + 1;
        *System.out.println(noHyphen);
        *for(int i = 0; i < noHyphen; i++){
        */
            int n = new Random().nextInt(word.length());
            brokenString = brokenString.substring(0, n) + "-" + brokenString.substring(n + 1, word.length());
        //}
        lostAlphabet = word.charAt(n) + "" ;
        return brokenString;

    }
    public void start(){
        Scanner scn = new Scanner(System.in);
        System.out.println(getbrokenString());
        for(int i = 0; i <  life; i++){
            String input = scn.next();
            if(input.equals(lostAlphabet)){
                System.out.println("you won");
                break;
            }
            else if(i == life-1){
                System.out.println("game ended");
            }
            else{
                System.out.println(life - i - 1 + " : lifes left" );
                
            }
            
        }
        
    }
    
    public String isCorrect(String input){
        if(input.equals(lostAlphabet) && life > 0){
            life = 5;
            return "Correct";
        }
        else if(life > 1){
            life--;
            return "Life : " + life; 
        }
        else{
            life = 5;
            return "game ended";
        }
    }
    
    public void reset(){
        life = 5;
    }
            
    
    
}
