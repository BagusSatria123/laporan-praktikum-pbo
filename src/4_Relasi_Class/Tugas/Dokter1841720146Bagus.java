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
public class Dokter1841720146Bagus {
    private String Id;
    private String nama;

    public Dokter1841720146Bagus() {
    }

    public Dokter1841720146Bagus(String Id, String nama) {
        this.Id = Id;
        this.nama = nama;
    }

    public void setIdBagus(String Id) {
        this.Id = Id;
    }

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public String getIdBagus() {
        return Id;
    }

    public String getNamaBagus() {
        return nama;
    }
    
    public String info(){
        String info ="";
         info += "Id : " + this.Id + "\n";         
         info += "Nama : " + this.nama + "\n";         
         
         return info;
    }
}
