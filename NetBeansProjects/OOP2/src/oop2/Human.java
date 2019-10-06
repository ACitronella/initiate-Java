/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author User
 */
public class Human {
    public String name = "";
    public String lastName = "";
    public String getName(){
        return name;
    }
    public String getlastName(){
        return lastName;  
    }
            
    public void Hello(){
        System.out.print("Hello " + name);
    }
    
    public void setName(String name){
        this.name = name;//ให้เอาตัวแปลด้านขวาไปใส่ด้านบน
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
}
