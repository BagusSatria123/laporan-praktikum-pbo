/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.inheritance.Percobaan2;

/**
 *
 * @author ROG SERIES
 */
public class P2_ClassB1841720146Bagus extends P2_ClassA1841720146Bagus{
    private int z;
     
    public void setZBagus(int z){
        this.z = z;
    }
    
        public void getNilaiZBagus(){
            System.out.println("nilai Z : "+z);       
    }
        
        public void getJumlahBagus(){
            System.out.println("Jumlah  : "+(getX()+getY()+z));           
        }
}
