/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9_P1.abstrakclass.Bagus;

/**
 *
 * @author ROG SERIES
 */
public class Orang1841720146Bagus {
private String nama;
private Hewan1841720146Bagus hewanPeliharaan;

    public Orang1841720146Bagus(String nama) {
        this.nama = nama;
    }


    public void peliharaHewan(Hewan1841720146Bagus hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakBagus();
        System.out.println("-----------------------------------------");
    }
}
