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
public class Komputer1841720146Bagus {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer1841720146Bagus() {
    }

    public Komputer1841720146Bagus(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilDataBagus(){
        System.out.println("Merk Komputer       : "+merk);
        System.out.println("Kecepatan komputer  : "+kecProsesor);
        System.out.println("Size Memory         : "+sizeMemory);
        System.out.println("jns Prosesor        : "+jnsProsesor);
    }
}
