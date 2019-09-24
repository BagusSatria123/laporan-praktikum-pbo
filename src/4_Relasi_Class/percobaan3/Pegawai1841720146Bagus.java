/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.percobaan3;

/**
 *
 * @author ROG SERIES
 */
public class Pegawai1841720146Bagus {
    private String nip;
    private String nama;

    public Pegawai1841720146Bagus() {
    }

    
    
    public Pegawai1841720146Bagus(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNipBagus(String nip) {
        this.nip = nip;
    }

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public String getNipBagus() {
        return nip;
    }

    public String getNamaBagus() {
        return nama;
    }
    
    
 
public String infoBagus() { 
    String info = ""; 
    info += "Nip: " + this.nip + "\n"; 
    info += "Nama: " + this.nama + "\n"; 
    return info; 
} 
 
}
