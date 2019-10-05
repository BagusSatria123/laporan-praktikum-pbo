/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.inheritance.Tugas2;

/**
 *
 * @author ROG SERIES
 */
public class Pc1841720146Bagus extends Komputer1841720146Bagus{
    public int ukuranMonitor;

    public Pc1841720146Bagus() {
    }

    public Pc1841720146Bagus(int ukuranMonitor, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPcbagus(){
        super.tampilDataBagus();
        System.out.println("Ukuran Monitor Anda         : "+ukuranMonitor);
    }
}
