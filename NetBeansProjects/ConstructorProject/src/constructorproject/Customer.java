/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorproject;

/**
 *
 * @author User
 */
public class Customer {
    private String name;
    private String lastName;
    private String address;
    
    public Customer(String name, String lastName, String address){//ชื่อเดียวกับclass //Codeในส่วนนี้จะถูกเรียกใช้ในทันทีเมื่อสร้างobject
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }
    
    public Customer(){
    
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public void run(){
        System.out.println("Hello X");
    }
    public void run(String a){
        System.out.println("Hello " + a );
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
