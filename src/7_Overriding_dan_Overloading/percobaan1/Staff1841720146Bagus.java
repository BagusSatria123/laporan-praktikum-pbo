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
public class Staff1841720146Bagus extends Karyawan1841720146Bagus {
    private int lembur;
    private double gajiLembur;

    public void setLemburBagus(int lembur) {
        this.lembur = lembur;
    }

    public void setGajiLemburBagus(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public int getLemburBagus() {
        return lembur;
    }

    public double getGajiLemburBagus() {
        return gajiLembur;
    }
    
       public double getGajiBagus(int lembur,double gajiLembur) {
        return super.getGajiBagus()+lembur*gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGajiBagus() {
        return super.getGajiBagus()+lembur*gajiLembur; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void lihatInfoBagus(){
        System.out.println("NIP             : "+this.getNipBagus());
        System.out.println("Nama            : "+this.getNamaBagus());
        System.out.println("Golongan        : "+this.getGolonganBagus());
        System.out.println("jumlah Lembur   : "+this.getLemburBagus());
        System.out.printf("Gaji Lembur      :%.0f\n",this.getGajiLemburBagus());
        System.out.printf("Gaji             :%.0f\n",this.getGajiBagus());
    }
    
}
