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
public class Pelanggan1841720146Bagus {
    private Sopir1841720146Bagus Sopir;
    private Mobil1841720146Bagus Mobil;
    private String nama;
    private int hari;

    public Pelanggan1841720146Bagus() {
    }

    public Pelanggan1841720146Bagus(Sopir1841720146Bagus Sopir, Mobil1841720146Bagus Mobil, String nama, int hari) {
        this.Sopir = Sopir;
        this.Mobil = Mobil;
        this.nama = nama;
        this.hari = hari;
    }

    public void setSopirBagus(Sopir1841720146Bagus Sopir) {
        this.Sopir = Sopir;
    }

    public void setMobilBagus(Mobil1841720146Bagus Mobil) {
        this.Mobil = Mobil;
    }

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public void setHariBagus(int hari) {
        this.hari = hari;
    }

    public Sopir1841720146Bagus getSopirBagus() {
        return Sopir;
    }

    public Mobil1841720146Bagus getMobilBagus() {
        return Mobil;
    }

    public String getNamaBagus() {
        return nama;
    }

    public int getHariBagus() {
        return hari;
    }
    
    public int hitungBiayaTotalBagus() { 
       return Mobil.hitungBiayaMobilBagus(hari) + Sopir.hitungBiayaSopirBagus(hari); 
    } 
 
}
