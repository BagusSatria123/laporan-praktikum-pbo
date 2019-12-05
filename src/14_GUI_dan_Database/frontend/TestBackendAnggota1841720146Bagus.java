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
import backend.Anggota1841720146Bagus;
import backend.Kategori1841720146Bagus;

public class TestBackendAnggota1841720146Bagus {
    
     public static void main(String[] args) {
        Anggota1841720146Bagus kat1 = new Anggota1841720146Bagus("Andy", "dampit","0853432423424");
        Anggota1841720146Bagus kat2 = new Anggota1841720146Bagus("Bagus", "Sawojajar", "0081274324");
        Anggota1841720146Bagus kat3 = new Anggota1841720146Bagus("Sutoyo", "pajajaran", "0324224224");

        //test insert
        kat1.saveBagus();
        kat2.saveBagus();
        kat3.saveBagus();

        // test update
        kat2.setAlamat("malang");
        kat2.saveBagus();

        //test delete
        kat3.deleteBagus();

        //test select all
        for (Anggota1841720146Bagus k : new Anggota1841720146Bagus().getAllBagus()) {
            System.out.println("Nama : " + k.getNama()+ ", alamat : " + k.getAlamat()+", telepon : " +k.getTelepon());

        }
        //test search
        for (Anggota1841720146Bagus k : new Anggota1841720146Bagus().searchBagus("udean")) {
            System.out.println("Nama : " + k.getNama()+ ", alamat : " + k.getAlamat()+", telepon : " +k.getTelepon());
        }
    }
}
