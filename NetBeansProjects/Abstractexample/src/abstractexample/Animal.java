/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexample;

/**
 *
 * @author User
 */
public abstract class Animal {
    private String name;
    private String DnaCode;
    
    public void eat(){
        System.out.println("Status : Eating");
    }
    
    public abstract void walk();
}
