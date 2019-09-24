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
public class KeretaApi1841720146Bagus {
    private String nama;
    private String kelas;
    private  Pegawai1841720146Bagus masinis; 
    private Pegawai1841720146Bagus asisten; 

    public KeretaApi1841720146Bagus() {
    }
    
    

    public KeretaApi1841720146Bagus(String nama, String kelas, Pegawai1841720146Bagus masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720146Bagus(String nama,String kelas, Pegawai1841720146Bagus masinis, Pegawai1841720146Bagus asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public void setKelasBagus(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinisBagus(Pegawai1841720146Bagus masinis) {
        this.masinis = masinis;
    }

    public void setAsistenBagus(Pegawai1841720146Bagus asisten) {
        this.asisten = asisten;
    }

    public String getNamaBagus() {
        return nama;
    }

    public String getKelasBagus() {
        return kelas;
    }

    public Pegawai1841720146Bagus getMasinisBagus() {
        return masinis;
    }

    public Pegawai1841720146Bagus getAsistenBagus() {
        return asisten;
    }
    
    public String infoBagus() { 
        String info = ""; 
        info += "Nama: " + this.nama + "\n"; 
        info += "Kelas: " + this.kelas + "\n"; 
        info += "Masinis: " + this.masinis.info() + "\n"; 
        info += "Asisten: " + this.asisten.info() + "\n"; 
        return info; 
    } 
    public String infoMasinisBagus(){
        String info = "";
        info += "Nama: " + this.nama + "\n"; 
        info += "Kelas: " + this.kelas + "\n"; 
        info += "===MASINIS==="+this.masinis.info()+ "\n";
        return info; 
    }
}
