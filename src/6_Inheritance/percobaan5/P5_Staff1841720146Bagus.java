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
public class P5_Staff1841720146Bagus extends P5_karyawan1841720146Bagus{
    
    public int lembur, potongan;

    public P5_Staff1841720146Bagus() {
    }

    public P5_Staff1841720146Bagus(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffbagus(){
        super.tampilDataKaryawanBagus();
        System.out.println("Lembur          = "+lembur);
        System.out.println("Potongan        = "+potongan);
        System.out.println("Total gaji      = "+(gaji+lembur-potongan));
    }
}
