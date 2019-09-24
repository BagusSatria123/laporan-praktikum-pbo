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
public class Sopir1841720146Bagus {
    private String nama;
    private int biaya;

    public Sopir1841720146Bagus() {
    }

    
    Sopir1841720146Bagus(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public void setBiayaBagus(int biaya) {
        this.biaya = biaya;
    }
    
    public String getNamaBagus() {
        return nama;
    }

    public int getBiayaBagus() {
        return biaya;
    }
 
    public int hitungBiayaSopirBagus(int hari) { 
        return biaya * hari; 
    } 
}

