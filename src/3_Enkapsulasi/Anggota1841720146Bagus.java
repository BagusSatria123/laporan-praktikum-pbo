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
public class Anggota1841720146Bagus {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota1841720146Bagus (String nama,String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    
    public void setNamaBagus(String nama){
        this.nama = nama;
        
    }
    public void setAlamatBagus(String alamat){
        this.alamat = alamat;
        
    }
    public String getNamaBagus(){
        return nama;
        
    }
    public String getAlamatBagus(){
        return alamat;
        
    }
    public float getSimpananBagus(){
        return simpanan;
        
    }
    public void setorBagus(float uang){
        simpanan += uang;
        
    }
    public void pinjamBagus(float uang){
        simpanan -= uang;
    }
    
}
