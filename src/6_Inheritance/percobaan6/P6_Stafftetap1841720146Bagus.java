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
public class P6_Stafftetap1841720146Bagus extends P6_Staff1841720146Bagus{
    public String golongan;
    public int asuransi;

    public P6_Stafftetap1841720146Bagus() {
    }

    public P6_Stafftetap1841720146Bagus(String golongan, int asuransi, int lembur, int potongan, String nama, String alamat, int umur, String jk, int gaji) {
        super(lembur, potongan, nama, alamat, umur, jk, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetapBagus(){
        System.out.println("=================== Data Staff Tetap ======================");
        super.tampilDataStaffBagus();
        System.out.println("Golongan        = "+golongan);
        System.out.println("Jumlah Asuransi = "+asuransi);
        System.out.println("Gaji Bersih     = "+(gaji+lembur-potongan-asuransi));
        
    }
    
}
