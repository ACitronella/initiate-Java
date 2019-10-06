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
public class Bill {
    private ArrayList<Book> books = new ArrayList<Book>();
    private double totalPrice = 0;
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    /**
     * @return the books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void calculateTotalPrice(){
        for(Book book:books){
            totalPrice += book.getPrice();
        }
    }
}
