/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author User
 */
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(set());
    }
    
    public static String set(){

        
      Company company2 = new Company();
      company2.setName("BB");
      company2.getName();
      Company company1 = new Company();
      company1.setName("AA");
      company1.getName();
      //Company.Name = "CC"; //จะทำแบบนี้ได้ก็ต่อเมื่อ Name เป็น static  ลองเอา//ออก
      return Company.Name; 
    } 
}
