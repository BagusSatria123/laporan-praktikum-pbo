/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9_P2.Interface.Bagus;

/**
 *
 * @author ROG SERIES
 */
public class Mahasiswa1841720146Bagus implements ICumlaude1841720146Bagus {
    protected String nama;

    public Mahasiswa1841720146Bagus(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusBagus() {
        System.out.println("Saya telah meyelesaikan SKRIPSI SATU BUKU"); 
    }

    @Override
    public void meraihIPKTinggiBagus() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    @Override
    public void kuliahDikampusBagus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    
}
