/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bornlibrary;

/**
 *
 * @author User
 */
public class User {
    private String Username = "";
    private String Password = "";
    public void setUsername(String name){
        this.Username = name;
    }
    public void setPassword(String pass){
        this.Password = pass;
    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
}
