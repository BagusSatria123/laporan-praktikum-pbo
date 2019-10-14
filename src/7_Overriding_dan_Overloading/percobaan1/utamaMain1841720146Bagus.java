/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagus.overloadingdanoverriding.percobaan1;

/**
 *
 * @author ROG SERIES
 */
public class utamaMain1841720146Bagus {
    public static void main(String[] args){
        
        System.out.println("Program Testing Class manager & Staff");
        Manager1841720146Bagus man[] = new Manager1841720146Bagus[2];
        Staff1841720146Bagus staff1[] = new Staff1841720146Bagus[2];
        Staff1841720146Bagus staff2[] = new Staff1841720146Bagus[3];
        
        //pembuatan Manager
        
        man[0] = new Manager1841720146Bagus();
        man[0].setNamaBagus("Tedjo");
        man[0].setNipBagus("101");
        man[0].setGolonganBagus("1");
        man[0].setTunjanganBagus(5000000);
        man[0].setBagianBagus("Administrasi");
        
        man[1] = new Manager1841720146Bagus();
        man[1].setNamaBagus("Atika");
        man[1].setNipBagus("102");
        man[1].setGolonganBagus("2");
        man[1].setTunjanganBagus(25000000);
        man[1].setBagianBagus("Pemasaran");
        
        staff1[0] = new Staff1841720146Bagus();
        staff1[0].setNamaBagus("Usman");
        staff1[0].setNipBagus("0003");
        staff1[0].setGolonganBagus("2");
        staff1[0].setLemburBagus(10);
        staff1[0].setGajiLemburBagus(10000);
        
        staff1[1] = new Staff1841720146Bagus();
        staff1[1].setNamaBagus("Anugrah");
        staff1[1].setNipBagus("0005");
        staff1[1].setGolonganBagus("2");
        staff1[1].setLemburBagus(10);
        staff1[1].setGajiLemburBagus(55000);
        man[0].setStBagus(staff1);
        
        staff2[0] = new Staff1841720146Bagus();
        staff2[0].setNamaBagus("Hendra");
        staff2[0].setNipBagus("0004");
        staff2[0].setGolonganBagus("3");
        staff2[0].setLemburBagus(15);
        staff2[0].setGajiLemburBagus(5500);
        
        staff2[1] = new Staff1841720146Bagus();
        staff2[1].setNamaBagus("Arie");
        staff2[1].setNipBagus("0006");
        staff2[1].setGolonganBagus("4");
        staff2[1].setLemburBagus(5);
        staff2[1].setGajiLemburBagus(100000);
        
        staff2[2] = new Staff1841720146Bagus();
        staff2[2].setNamaBagus("Mentari");
        staff2[2].setNipBagus("0007");
        staff2[2].setGolonganBagus("3");
        staff2[2].setLemburBagus(6);
        staff2[2].setGajiLemburBagus(20000);
        man[1].setStBagus(staff2);
        
        //cetak informasi dari manager dan Staffnya
        
        man[0].lihatInfobagus();
        man[1].lihatInfobagus();

    }
}
