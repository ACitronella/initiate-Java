/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffer;

/**
 *
 * @author User
 */
public class StringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(test());
    }
    public static StringBuilder test(){
        StringBuilder name = new StringBuilder("John");
        System.out.println(name);
        name.append(" Dio");
        System.out.println(name);
        name.delete(2, 4);//ลบตั้งแต่ตัวไหนถึงตัวไหน
        return name;
    }
}
