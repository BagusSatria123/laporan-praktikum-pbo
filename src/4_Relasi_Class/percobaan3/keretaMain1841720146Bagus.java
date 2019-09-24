/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.percobaan3;

/**
 *
 * @author ROG SERIES
 */
public class keretaMain1841720146Bagus {
    public static void main(String[] args){
    Pegawai1841720146Bagus masinis1 = new Pegawai1841720146Bagus("1234","Spongebob Squarepants");
    Pegawai1841720146Bagus asisten1 = new Pegawai1841720146Bagus("4567","Patrick Star");
    
    KeretaApi1841720146Bagus keretaApi  = new KeretaApi1841720146Bagus("Gaya Baru","Bisnis",masinis1,asisten1);
        System.out.println(keretaApi.infoBagus());
    
        //pertanyaan
        
        Pegawai1841720146Bagus masinis2 = new Pegawai1841720146Bagus("1234", "Spongebob Squarepants"); 
        KeretaApi1841720146Bagus keretaApi2 = new KeretaApi1841720146Bagus("Gaya Baru", "Bisnis", masinis2); 
 
        System.out.println(keretaApi.infoBagus()); 
    }
}
