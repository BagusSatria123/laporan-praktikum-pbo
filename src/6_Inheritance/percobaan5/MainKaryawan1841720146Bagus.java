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
public class MainKaryawan1841720146Bagus {
    public static void main(String[] args){
        // TODO code application logic here
        
        P5_Manager1841720146Bagus M = new P5_Manager1841720146Bagus();
        M.nama ="Vivin";
        M.alamat="JL. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManagerBagus();
        
        P5_Staff1841720146Bagus S = new P5_Staff1841720146Bagus();
        S.nama ="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaffbagus();
    }
}
