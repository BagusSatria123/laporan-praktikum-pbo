/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9_P3.InterfaceImplementation.Bagus;

/**
 *
 * @author ROG SERIES
 */
public class P3_Sarjana1841720146Bagus extends P3_Mahasiswa1841720146Bagus implements P3_ICumlaude1841720146Bagus,P3_IBerprestasi1841720146Bagus{

    public P3_Sarjana1841720146Bagus(String nama) {
        super(nama);
    }

    
    @Override
    public void lulusBagus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiBagus() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }

    @Override
    public void menjuaraiKompetisiBagus() {
        System.out.println("Kompetisi Nasional borrr");    }

    @Override
    public void membuatPublikasiIlmiahBagus() {
        System.out.println("Saya telah menerbitkan Jurnalisa Kelas INTERNASIONAL");
    }
    

    
}
