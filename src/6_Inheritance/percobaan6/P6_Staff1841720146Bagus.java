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
public class P6_Staff1841720146Bagus extends P6_Karyawan1841720146Bagus {
    public int lembur;
    public int potongan;

    public P6_Staff1841720146Bagus() {
    }

    public P6_Staff1841720146Bagus(int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(nama, alamat, umur, jk, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffBagus(){
        super.tampilDatakaryawanBagus();
        System.out.println("lembur      = "+lembur);
        System.out.println("potongan    = "+potongan);
        System.out.println("Total gaji      = "+(gaji+lembur-potongan));

    }
}
