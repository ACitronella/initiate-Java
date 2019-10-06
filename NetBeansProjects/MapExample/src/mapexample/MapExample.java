/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class MapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map map = new HashMap();
        map.put("Jo", 12);//(Key, Object)
        
        System.out.println(map.get("Jo"));
        System.out.println(map.get(5));
    }
    
}
