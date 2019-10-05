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
public class P6_MainStaff1841720146Bagus {
    public static void main(String[] args){
        //TODO code application logic here
        P6_Stafftetap1841720146Bagus ST = new P6_Stafftetap1841720146Bagus("2A",2000000,20,250000,"Budi","Malang",20,"laki-Laki",1000);
       ST.tampilStaffTetapBagus();
       
       P6_StaffHarian1841720146Bagus SH = new P6_StaffHarian1841720146Bagus(100,100000,50000,"Indah","Malang",27,"Perempuan",10000);
       SH.tampilStaffharian();
    }
}
