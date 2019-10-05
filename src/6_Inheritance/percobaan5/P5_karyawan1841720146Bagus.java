/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.inheritance.Percobaan5;

/**
 *
 * @author ROG SERIES
 */
public class P5_karyawan1841720146Bagus {
    public String nama, alamat, jk;
    public int umur, gaji;

    public P5_karyawan1841720146Bagus() {
    }

    public P5_karyawan1841720146Bagus(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void tampilDataKaryawanBagus(){
        System.out.println("Nama            = "+nama);
        System.out.println("Alamat          = "+alamat);
        System.out.println("Jenis kelamin   = "+jk);
        System.out.println("Umur            = "+umur);
        System.out.println("Gaji            = "+gaji);
    }
}
