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
public class BarangMain1841720146Bagus {
    public static void main(String[] args){
        Barang1841720146Bagus brg1 = new Barang1841720146Bagus();
        brg1.namaBarang = "Pensil";
        brg1.jenisBarang = "ATK";
        brg1.stokBarang = 10;
        brg1.tampilBarangBagus();
        
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah "+brg1.tambahStokBagus(20));
    }
}
