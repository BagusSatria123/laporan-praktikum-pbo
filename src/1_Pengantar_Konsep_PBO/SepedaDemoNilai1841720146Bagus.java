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
public class SepedaDemoNilai1841720146Bagus {
    public static void main(String[] args){
        
        //DUA OBJEK SEPEDA
        Sepeda1841720146Bagus spd1 = new Sepeda1841720146Bagus();
        Sepeda1841720146Bagus spd2 = new Sepeda1841720146Bagus();
        
        //Panggil method didalam objek sepeda
        spd1.Warna("Hijau");
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.Warna("Merah");
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
    }
}
