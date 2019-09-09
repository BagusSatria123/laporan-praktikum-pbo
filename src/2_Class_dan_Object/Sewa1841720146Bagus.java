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
public class Sewa1841720146Bagus {
    
    public int id;
    public String namaMember;
    public String namagame;
    public int Totalhasil;
    public int stokbarang;
    public int harga;
    
    public void hitunganHargaBagus(){
     Totalhasil = harga * stokbarang;
    }
    public void tampilBarang1Bagus(){
        System.out.println("id          : "+id);
        System.out.println("nama Member : "+namaMember);
        System.out.println("Stock Barang: "+stokbarang);
        System.out.println("Total Hasil : "+Totalhasil);
        
    }
}
