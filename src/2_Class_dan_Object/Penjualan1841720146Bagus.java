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
public class Penjualan1841720146Bagus {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargajual;
    
    public void HargaJual(){
        hargajual = (int) (hargaDasar - (diskon * hargaDasar)/100);
    }
    public void tampilData(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Diskon      : "+diskon);
        System.out.println("Harga Jual  : "+hargajual);
    }
}
