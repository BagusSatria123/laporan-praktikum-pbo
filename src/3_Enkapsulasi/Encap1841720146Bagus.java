/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigetterstter;

/**
 *
 * @author ROG SERIES
 */
public class Encap1841720146Bagus {
    private String name;
    private int age;
    
    public String getName(){
        return name;
        
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
        
    }
    public void setAge(int newAge){
        if(newAge <= 18){
            age = 18;           
        }
        else if(newAge >= 30){
            age = 30;
        }
        else{
            age = newAge;
        }
    }
    
}
