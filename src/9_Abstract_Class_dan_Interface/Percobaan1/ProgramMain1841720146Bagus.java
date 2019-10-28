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
public class ProgramMain1841720146Bagus {
    public static void main(String[] args){
        Kucing1841720146Bagus Kucingkampung = new Kucing1841720146Bagus();
        Ikan1841720146Bagus Lumbalumba = new Ikan1841720146Bagus();
        
        Orang1841720146Bagus ani = new Orang1841720146Bagus("Ani");
        Orang1841720146Bagus Budi = new Orang1841720146Bagus("Budi");
        
        ani.peliharaHewan(Kucingkampung);
        Budi.peliharaHewan(Lumbalumba);
        
        
        ani.ajakPeliharaanJalanJalan();
        Budi.ajakPeliharaanJalanJalan();
        
    }
}
