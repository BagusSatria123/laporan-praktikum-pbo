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
public class AnggotaNew1841720146Bagus {
    private int NoKTP,batasan,jumlah;
    private String nama;
    

    //menyebut konstructor
    AnggotaNew1841720146Bagus  (String nama,int NoKTP,int batasan ){
        this.nama = nama;
        this.NoKTP = NoKTP;
        this.batasan = batasan;
    }
      
    public void setNamaBagus(String nama){
        this.nama = nama;
    }
    
    public void setNoKTPBagus(int NoKTP){
        this.NoKTP = NoKTP;
    }
    
    public String getNamaBagus(){
        return nama;
    }
    
    public int getNomorKtpBagus(){
        return NoKTP;
    } 
     
    //pemanggilan data pinjaman yang diisi
    public int getbatasanBagus(){
        return batasan;
    }
    
    //pengisian jumlah pinjaman
     public void setjumlahPinjamanBagus(int pinjam){
         if(pinjam < batasan){
             jumlah = pinjam;
         }
         else{
             System.out.println("anda melebihi batas");
         }
    }
     
     //data pinjaman yang diisi
      public int getbatasanPinjamanBagus(){
        return batasan;
    }
      public int getJumlahPinjamanBagus(){
          return jumlah;
      }
      public void angsuranBagus(int uang) {
        if (uang >= (jumlah * 0.1)) {
            jumlah -= uang;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
