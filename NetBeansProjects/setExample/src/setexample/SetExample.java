/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setexample;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class SetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<Integer> set = new HashSet<Integer>();
        
        set.add(584);
        set.add(54);
        System.out.println(set.add(null));
        System.out.println(set);
    }
    
}
