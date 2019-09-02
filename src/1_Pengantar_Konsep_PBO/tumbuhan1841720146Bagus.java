/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo.sepedademo;

/**
 *
 * @author ROG SERIES
 */
public class tumbuhan1841720146Bagus {
    private String nama_tumbuhan;
    private int jumlah_daun;
    private int jumlah_batang;
    
    public void setnamatumbuhan(String nama){
        nama_tumbuhan = nama;
    }
    public void pertambahan_daun(int increment){
        jumlah_daun = jumlah_daun + increment;
    }
    public void pertambahan_batang(int increment){
        jumlah_batang = jumlah_batang + increment;
    }
    public void cetak(){
        System.out.println("Nama Tumbuhan : "+nama_tumbuhan);
        System.out.println("Daun          : "+jumlah_daun);
        System.out.println("Batang        : "+jumlah_batang);
    }
}
