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
public class TumbuhansingkongDemo1841720146Bagus {
    public static void main(String[] args){
        
        //3 objek Tumbuhan
        tumbuhan1841720146Bagus tbh1 = new tumbuhan1841720146Bagus();
        tumbuhan1841720146Bagus tbh2 = new tumbuhan1841720146Bagus();
        Tumbuhansingkong1841720146Bagus tbh3 = new Tumbuhansingkong1841720146Bagus();
        
        //Panggil method di dalam objek tumbuhan
        tbh1.setnamatumbuhan("nangka");
        tbh1.pertambahan_daun(5);
        tbh1.pertambahan_batang(4);
        tbh1.pertambahan_daun(10);
        tbh1.cetak();
               
        tbh2.setnamatumbuhan("mangga");
        tbh2.pertambahan_daun(10);
        tbh2.pertambahan_batang(6);
        tbh2.pertambahan_daun(10);
        tbh2.cetak();
        
        tbh3.setnamatumbuhan("mSingkong");
        tbh3.pertambahan_daun(14);
        tbh3.pertambahan_batang(8);
        tbh3.pertambahan_daun(4);
        tbh3.settanahtumbuhan("Pupuk Hewan");
        tbh3.cetak();        
        
    }
}
