/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasi1841720146bagus;
import java.util.Scanner;
/**
 *
 * @author ROG SERIES
 */
public class TestKoperasi1841720146Bagus {
    public static void main(String[] args)  { 
        Scanner sc = new Scanner(System.in);
        
        AnggotaNew1841720146Bagus donny = new AnggotaNew1841720146Bagus( "BAGUS", 1841720146, 5000000);

        
        System.out.println("Nama Anggota: " + donny.getNamaBagus());
        System.out.println("Nomor KTP : " + donny.getNomorKtpBagus());
        System.out.println("Limit Pinjaman: " + donny.getbatasanPinjamanBagus());        
        
        System.out.print("\nMasukkan jumlah Pinjaman : ");
        int pinjaman = sc.nextInt();
        donny.setjumlahPinjamanBagus(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanBagus());
        
        
        System.out.print("\nMasukkan jumlah Angsuran : ");
        int angsuran = sc.nextInt();
        donny.angsuranBagus(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanBagus());
        
    }    
}