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
public class Mac1841720146Bagus extends Laptop1841720146Bagus{
    public String security;

    public Mac1841720146Bagus() {
    }

    public Mac1841720146Bagus(String security, String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBaterai, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.security = security;
    }
    
    public void tampilMacBagus(){
        super.tampilLaptopBagus();
        System.out.println("Security            : "+security);
    }
}
