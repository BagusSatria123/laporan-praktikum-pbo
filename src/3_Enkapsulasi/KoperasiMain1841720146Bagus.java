/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasi1841720146bagus;

/**
 *
 * @author ROG SERIES
 */
public class KoperasiMain1841720146Bagus {
     public static void main(String[] args) 
    {
        AnggotaNew1841720146Bagus donny = new AnggotaNew1841720146Bagus("BAGUS", 1841720146, 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNamaBagus());
        System.out.println("Limit Pinjaman: " + donny.getbatasanPinjamanBagus());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.setjumlahPinjamanBagus(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanBagus());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.setjumlahPinjamanBagus(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanBagus());
        
        System.out.println("\nMeminjam uang 200.000...");
        donny.angsuranBagus(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanBagus());
        
        System.out.println("\nMeminjam uang 3.000.000...");
        donny.angsuranBagus(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanBagus());
    }    
}
