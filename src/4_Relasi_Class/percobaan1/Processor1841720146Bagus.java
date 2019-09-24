/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.percobaan1;

/**
 *
 * @author ROG SERIES
 */
public class Processor1841720146Bagus {
    private String merk;
    private double cache;
    
    public  Processor1841720146Bagus(){
        
    }
    Processor1841720146Bagus(String merk,double cache){
        this.merk = merk;
        this.cache = cache;       
    }
    
    public void setMerkBagus(String merk){
        this.merk = merk;
    }
    public void setCacheBagus(double cache){
        this.cache = cache; 
    }
    
    public String getMerkBagus(){
        return merk;
    }
    public double getCacheBagus(){
        return cache;
    }
    public void info() { 
        System.out.printf("Merk Processor = %s\n", merk); 
        System.out.printf("Cache Memory = %.2f\n", cache); 
    } 
 
}
