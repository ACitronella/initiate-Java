/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangui;

import java.util.Random;

/**
 *
 * @author User
 */
public class WordList {
    private String[] wordList = {"jougs", "languor", "burganet", "nerka", "warden"};

    /**
     * @return the wordList
     */
    public String[] getWordList() {
        return wordList;
    }
    
    public String getWord(int index){
        return wordList[index];
    }
    
    public String getRandonWord(){
        int i = new Random().nextInt(wordList.length);
        return wordList[i];
    }
    
    
}
