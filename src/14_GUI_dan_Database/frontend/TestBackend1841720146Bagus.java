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
public class TestBackend1841720146Bagus {

    public static void main(String[] args) {
        Kategori1841720146Bagus kat1 = new Kategori1841720146Bagus("Novel", "Koleksi bubku novel");
        Kategori1841720146Bagus kat2 = new Kategori1841720146Bagus("Referensi", "Buku referensi ilmiah");
        Kategori1841720146Bagus kat3 = new Kategori1841720146Bagus("Komik", "Komik anak-anak");

        //test insert
        kat1.saveBagus();
        kat2.saveBagus();
        kat3.saveBagus();

        // test update
        kat2.setKeteranganBagus("koleksi buku referensi ilmiah");
        kat2.saveBagus();

        //test delete
        kat3.deleteBagus();

        //test select all
        for (Kategori1841720146Bagus k : new Kategori1841720146Bagus().getAllBagus()) {
            System.out.println("Nama : " + k.getNamaBagus() + ", ket : " + k.getKeteranganBagus());

        }
        //test search
        for (Kategori1841720146Bagus k : new Kategori1841720146Bagus().searchBagus("ilmiah")) {
            System.out.println("Nama : " + k.getNamaBagus() + ", ket : " + k.getKeteranganBagus());
        }
    }
}
