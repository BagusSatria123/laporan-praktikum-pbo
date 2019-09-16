/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigetterstter;

/**
 *
 * @author ROG SERIES
 */
public class KoperasiDemo1841720146Bagus {
    public static void main(String[] args){
        Anggota1841720146Bagus anggota1 = new Anggota1841720146Bagus("Iwan","Jalan Mawar");
        
        System.out.println("Simpanan "+anggota1.getNamaBagus()+" : Rp"+anggota1.getSimpananBagus());
        
        anggota1.setNamaBagus("Iwan Setiawan");
        anggota1.setAlamatBagus("Jalan Sukarno Hatta no 10");
        anggota1.setorBagus(100000);
        System.out.println("Simpanan "+anggota1.getNamaBagus()+" : Rp"+anggota1.getSimpananBagus());
        
        anggota1.pinjamBagus(5000);
        System.out.println("Simpanan "+anggota1.getNamaBagus()+" : Rp"+anggota1.getSimpananBagus());
    }
}
