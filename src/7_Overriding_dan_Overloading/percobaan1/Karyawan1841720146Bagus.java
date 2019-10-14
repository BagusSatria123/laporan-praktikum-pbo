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
public class Karyawan1841720146Bagus {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public void setNipBagus(String nip) {
        this.nip = nip;
    }

    public void setGolonganBagus(String golongan) {
        this.golongan = golongan;
        
        switch(golongan.charAt(0)){
            case '1':this.gaji=5000000;
            break;
            case '2':this.gaji=3000000;
            break;
            case '3':this.gaji=2000000;
            break;
            case '4':this.gaji=1000000;
            break;
            case '5':this.gaji=750000;
            break;
        }
    }

    public void setGajiBagus(double gaji) {
        this.gaji = gaji;
    }

    public String getNamaBagus() {
        return nama;
    }

    public String getNipBagus() {
        return nip;
    }

    public String getGolonganBagus() {
        return golongan;
    }

    public double getGajiBagus() {
        return gaji;
    }
    
    
}
