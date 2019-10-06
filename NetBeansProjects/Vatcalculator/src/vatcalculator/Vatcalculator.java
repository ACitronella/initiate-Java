/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vatcalculator;

/**
 *
 * @author User
 */
public class Vatcalculator {
    
static float price = 100.0f;
static float vat = 7.0f;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(cal());
    }
    public static float cal(){
        float total = price+(price*vat/100);
        return total;
    }
}
