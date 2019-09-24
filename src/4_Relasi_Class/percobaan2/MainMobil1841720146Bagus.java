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
public class MainMobil1841720146Bagus {
    public class MainMobil1841720146Bagus {
    public static void main(String[] args){
    Mobil1841720146Bagus m1 = new Mobil1841720146Bagus();
    m1.setMerkMobilBagus("Avanza");
    m1.setBiayaMobilBagus(350000); 
    Sopir1841720146Bagus s = new Sopir1841720146Bagus(); 
    s.setNamaBagus("John Doe"); 
    s.setBiayaBagus(200000); 
    

    Pelanggan1841720146Bagus p = new Pelanggan1841720146Bagus(); 
    p.setNamaBagus("Jane Doe"); 
    p.setMobilBagus(m1); 
    p.setSopirBagus(s); 
    p.setHariBagus(2); 
    System.out.println("Biaya Total = " +  p.hitungBiayaTotalBagus()); 
    
    // Pertanyaan
    System.out.println(p.getMobilBagus().getmerkMobilBagus()); 
  }
}
