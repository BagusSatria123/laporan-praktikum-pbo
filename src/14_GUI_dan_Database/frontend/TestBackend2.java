/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author ROG SERIES
 */
import backend.*;
public class TestBackend2 {

    public static void main(String[] args) {
        Kategori1841720146Bagus novel = new Kategori1841720146Bagus().getByIdBagus(27);
        Kategori1841720146Bagus referensi = new Kategori1841720146Bagus().getByIdBagus(28);
        Buku1841720146Bagus buku1 = new Buku1841720146Bagus(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720146Bagus buku2 = new Buku1841720146Bagus(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720146Bagus buku3 = new Buku1841720146Bagus(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
    
        //test insert
        buku1.saveBagus();
        buku2.saveBagus();
        
        //test update
        buku2.setJudul("Aljabar Linier");
        buku2.saveBagus();
        
        //test delete
        buku3.deleteBagus();
        
        //test select all
        for(Buku1841720146Bagus b : new Buku1841720146Bagus().getAllBagus()){
            System.out.println("Kategori: "+b.getKategori().getNamaBagus()+", Judul : "+b.getJudul());
        }
        
        //test search
        for(Buku1841720146Bagus b : new Buku1841720146Bagus().searchBagus("timun")){
            System.out.println("Kategori: "+b.getKategori().getNamaBagus()+", Judul: "+b.getJudul());
        }
    }
    
    }
