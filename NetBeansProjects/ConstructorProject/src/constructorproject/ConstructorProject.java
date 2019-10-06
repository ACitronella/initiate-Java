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
public class ConstructorProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer customer1 = new Customer("Phuriwat" , "A" , "Aree");
        System.out.println(customer1.getName()+" "+customer1.getLastName());
        
        customer1.run();
        customer1.run("ACitronella");
    }
    
}
