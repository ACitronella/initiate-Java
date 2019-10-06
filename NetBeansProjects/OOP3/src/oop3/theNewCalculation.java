/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author User
*///               คลาสลูก                คลาสแม่
public class theNewCalculation extends Calculation {//extends เอาClass แม่มาใส่Class ลูก

    public double multiplication(double x ,double y){
        return x*y;
    }
    public double division(double x,double y){
        return x/y;
    }
}
