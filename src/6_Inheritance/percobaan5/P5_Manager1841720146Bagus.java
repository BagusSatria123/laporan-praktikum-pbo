/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.inheritance.Percobaan5;

/**
 *
 * @author ROG SERIES
 */
public class P5_Manager1841720146Bagus extends P5_karyawan1841720146Bagus{
    public int tunjangan;

    public P5_Manager1841720146Bagus() {
        
    }
    
    public void tampilDataManagerBagus(){
        super.tampilDataKaryawanBagus();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("Total gaji      = "+(super.gaji + tunjangan));
    }
    
}
