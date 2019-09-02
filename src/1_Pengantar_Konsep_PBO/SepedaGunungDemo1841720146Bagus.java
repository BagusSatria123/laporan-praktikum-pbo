/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo.sepedademo;

/**
 *
 * @author ROG SERIES
 */
public class SepedaGunungDemo1841720146Bagus {
    
    public static void main(String[] args){
    //3 Objek Sepda
        Sepeda1841720146Bagus spd1 = new Sepeda1841720146Bagus();
        Sepeda1841720146Bagus spd2 = new Sepeda1841720146Bagus();
        SepedaGunung1841720146Bagus spd3 = new SepedaGunung1841720146Bagus();
        
    // Panggil Method didalam Objek Sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Thor");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.tambahKecepatan(10);
        spd3.gantiGear(3);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();
        
    }
}
