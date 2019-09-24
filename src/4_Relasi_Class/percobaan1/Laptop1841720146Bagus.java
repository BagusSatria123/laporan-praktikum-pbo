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
public class Laptop1841720146Bagus {
    private String merk; 
    private Processor1841720146Bagus proc; 
    
    public  Laptop1841720146Bagus(){
        
    }
    
public Laptop1841720146Bagus(String merk,Processor1841720146Bagus proc){
        this.merk = merk;
        this.proc = proc;       
    }
    public void info() { 
        System.out.println("Merk Laptop = " + merk); 
        proc.info(); 
    } 
    public void setMerkLaptopBagus(String merk){
        this.merk = merk;
    }
    public void setProcLaptopBagus(Processor1841720146Bagus proc){
        this.proc = proc; 
    }

    public String getMerkLaptopBagus() {
        return merk;
    }

    public Processor1841720146Bagus getProcLaptopBagus() {
        return proc;
    }
}
