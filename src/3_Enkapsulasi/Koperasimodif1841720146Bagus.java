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
public class Koperasimodif1841720146Bagus {
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        System.out.print("Masukkan Nomor KTP : ");
        String noKTP = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String Nama = sc.nextLine();
        System.out.print("Masukkan Limit Pinjaman : ");
        int limitPinjaman = sc.nextInt();
        System.out.println();
        
        AnggotaNew1841720146Bagus donny = new AnggotaNew1841720146Bagus("BAGUS", 1841720146, 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNamaBagus());
        System.out.println("Limit Pinjaman: " + donny.getbatasanPinjamanBagus());
        
        do {
            System.out.println("--------------------------");
            System.out.println("Apa yang anda inginkan?");
            System.out.println("--------------------------");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.println("--------------------------");
            System.out.print("Masukan Pilihan");
            pilihan = sc.nextInt();
            System.out.println("--------------------------");
            switch(pilihan) {
                case 1 :
                    System.out.print("Masukkan Nominal Uang : ");
                    int pinjam = sc.nextInt();
                    System.out.println("Meminjam Uang " + pinjam);
                    donny.setjumlahPinjamanBagus(pinjam);
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjamanBagus());
                    break;
                case 2 : 
                    System.out.print("Masukkan Nominal Uang : ");
                    int angsur = sc.nextInt();
                    System.out.println("Meminjam Uang " + angsur);
                    donny.setjumlahPinjamanBagus(angsur);
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjamanBagus());
                    break;
            }
        }while(pilihan != 3);
    } 
}
