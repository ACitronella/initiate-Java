/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bornlibrary;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BornLibrary {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Book> books ;
    public static void main(String[] args) {
        // TODO code application logic here
        books = new ArrayList<Book>();
        main1 login = new main1();
        login.setAlwaysOnTop(true);
        login.setVisible(true);
    }
    public static void checkbook(int index){
        System.out.println("Book info");
        System.out.println("Name: " + books.get(index).getName());
        System.out.println("IBSN: " + books.get(index).getISBN());
    }
}

    
