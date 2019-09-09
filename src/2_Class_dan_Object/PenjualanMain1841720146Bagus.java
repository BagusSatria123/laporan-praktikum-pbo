/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uml;

import java.util.Scanner;

/**
 *
 * @author ROG SERIES
 */
public class PenjualanMain1841720146Bagus {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String oyi;
        Penjualan1841720146Bagus P1 = new Penjualan1841720146Bagus();
        
        System.out.println("Apakah Anda sudah belanja? ");
        oyi = sc.nextLine();
        if(oyi.equals("iya")){
            
        }
        System.out.println("Masukkan kode Barang    : ");
        P1.kode=sc.nextLine();
        System.out.println("Masukkan Nama Barang    : ");
        P1.namaBarang=sc.nextLine();
        System.out.println("Masukkan harga Dasar    : ");
        P1.hargaDasar=sc.nextInt();
        System.out.println("Masukkan diskon Barang  : ");
        P1.diskon=sc.nextFloat();
        P1.HargaJual();
        P1.tampilData();
        
        
    }
}
