/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author User
 */
public class mammal implements Animal{

    @Override
    public void eat(int a) {
        System.out.println(a);
    }

    @Override
    public void travel() {
        System.out.println("traveling");
    }

    
    
}
