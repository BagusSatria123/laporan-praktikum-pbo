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
public class P3_PascaSarjana1841720146Bagus extends P3_Mahasiswa1841720146Bagus implements P3_ICumlaude1841720146Bagus,P3_IBerprestasi1841720146Bagus{

    public P3_PascaSarjana1841720146Bagus(String nama) {
        super(nama);
    }

    
    
    @Override
    public void menjuaraiKompetisiBagus() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahBagus() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
    
}
