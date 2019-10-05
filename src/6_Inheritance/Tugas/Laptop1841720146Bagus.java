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
public class Laptop1841720146Bagus extends Komputer1841720146Bagus {
    public String jnsBaterai;

    public Laptop1841720146Bagus() {
    }

    public Laptop1841720146Bagus(String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLaptopBagus(){
        super.tampilDataBagus();
        System.out.println("Baterai     : "+jnsBaterai);
    }
}
