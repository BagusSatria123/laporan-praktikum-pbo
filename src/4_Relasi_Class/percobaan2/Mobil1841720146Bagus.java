/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.percobaan2;

/**
 *
 * @author ROG SERIES
 */
public class Mobil1841720146Bagus {
    private String merk;
    private int biaya;

    public Mobil1841720146Bagus() {
    }
    
    
  Mobil1841720146Bagus(String merk,int biaya){
        this.merk = merk;
        this.biaya = biaya;       
    }
  
  public void setMerkMobilBagus(String merk){
        this.merk = merk;
  }
  
  public void setBiayaMobilBagus(int biaya){
        this.biaya = biaya;
  }
  
  public String getmerkMobilBagus(){
      return merk;
  }
  
  public int getBiayaMobilBagus(){
      return biaya;
  }
  
  public int hitungBiayaMobilBagus(int hari) { 
      return biaya * hari; 
  } 
 
}
