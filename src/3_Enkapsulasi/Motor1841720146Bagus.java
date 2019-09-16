/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enkapsulasi;

/**
 *
 * @author ROG SERIES
 */
public class Motor1841720146Bagus {
    private int kecepatan = 0;
    private boolean kontak0n = false;
    
   
    public void nyalakanMesinBagus(){
        kontak0n = true;
        
    }
    public void matikanMesinBagus(){
        kecepatan = 0;
        kontak0n = false;
        
    }
    public void tambahKecepatanBagus(){
        if(kecepatan <= 100){
            kecepatan += 5;
        }
        else{
            System.out.println("Kecepatan tidak bertambah karena melebihi batas maksimal \n");
            
        }
    }
    public void kurangiKecepatanBagus(){
        if(kecepatan >= 100){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan berkurang karena melebihi maksimal \n");
            
        }
    }
         
    
      public void printStatusBagus(){
        if (kontak0n == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
        
    }
}
