/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.Tugas;

/**
 *
 * @author ROG SERIES
 */
public class Pasien1841720146Bagus {
    private int Id;
    private String nama;
    private String penyakit;

    public Pasien1841720146Bagus() {
    }

    public Pasien1841720146Bagus(int Id, String nama, String penyakit) {
        this.Id = Id;
        this.nama = nama;
        this.penyakit = penyakit;
    }

    
    
    public void setIdBagus(int Id) {
        this.Id = Id;
    }

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public void setPenyakitBagus(String penyakit) {
        this.penyakit = penyakit;
    }

    public int getIdBagus() {
        return Id;
    }

    public String getNamaBagus() {
        return nama;
    }

    public String getPenyakitBagus() {
        return penyakit;
    }
    
    public String info(){
        String info ="";
         info += "NIM : " + this.Id + "\n";         
         info += "Nama : " + this.nama + "\n";         
         info += "Kelas : " + this.penyakit + "\n";         
         
         return info;
    }
}
