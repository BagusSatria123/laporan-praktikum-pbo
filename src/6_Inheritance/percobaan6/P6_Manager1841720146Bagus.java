/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.inheritance.Percobaan6;

/**
 *
 * @author ROG SERIES
 */
public class P6_Manager1841720146Bagus extends P6_Karyawan1841720146Bagus{
    public int tunjangan;

    public P6_Manager1841720146Bagus() {
    }
    
    public void tampilDatamanagerBagus(){
        super.tampilDatakaryawanBagus();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("Total gaji      = "+(super.gaji + tunjangan));
    }
}
