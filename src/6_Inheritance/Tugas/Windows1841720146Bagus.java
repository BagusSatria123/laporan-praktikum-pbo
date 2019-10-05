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
public class Windows1841720146Bagus extends Mac1841720146Bagus{
    public String fitur;

    public Windows1841720146Bagus() {
    }

    public Windows1841720146Bagus(String fitur, String security, String jnsBaterai, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(security, jnsBaterai, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }
    
    public void tampilWindowsBagus(){
        super.tampilLaptopBagus();
        System.out.println("Fitur di Windows    :      "+fitur);
    }
    
}
