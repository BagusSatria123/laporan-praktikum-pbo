/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagus.Tugas.Overriding;

/**
 *
 * @author ROG SERIES
 */
public class ManusiaMain1841720146Bagus {
    public static void main(String[] args){
      Manusia1841720146Bagus Ma1 = new Manusia1841720146Bagus();
        Ma1.bernafasBagus();
        Ma1.makanBagus();
        System.out.println("-------------------------------------------------");        
        Dosen1841720146Bagus D1 = new Dosen1841720146Bagus();
        D1.makanBagus();
        D1.lemburBagus();
        System.out.println("-------------------------------------------------");
        Mahasiswa1841720146Bagus Mh1 = new Mahasiswa1841720146Bagus();
        Mh1.makanBagus();
        Mh1.tidurBagus();
        System.out.println("-------------------------------------------------");

                }
}
