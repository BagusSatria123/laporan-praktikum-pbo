/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uml;

/**
 *
 * @author ROG SERIES
 */
public class Barang1841720146Bagus {
    public String namaBarang;
    public String jenisBarang;
    public int stokBarang;
    
    public void tampilBarangBagus(){
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Jenis Barang: "+jenisBarang);
        System.out.println("Stok        : "+stokBarang);
    }
    //method dengan argumen dan nilai balik (return)
    public int tambahStokBagus(int barangMasuk){
      int stokBaru = barangMasuk + stokBarang;
      return stokBaru;
    }
}
