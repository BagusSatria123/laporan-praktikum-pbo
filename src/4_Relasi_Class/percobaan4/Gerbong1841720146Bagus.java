/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasicalss.percobaan4;

/**
 *
 * @author ROG SERIES
 */
public class Gerbong1841720146Bagus {
    private String mKode;
    private Kursi1841720146Bagus[] mArrayKursi;
    
    public Gerbong1841720146Bagus(String kode, int jumlah){
        this.mKode = kode;
        this.mArrayKursi = new Kursi1841720146Bagus[jumlah];
        this.initKursiBagus();
    }
   public void setPenumpangBagus(Penumpang1841720146Bagus mPenumpang, int mNomor){
        if(this.mArrayKursi[mNomor - 1].getmPenumpangBagus()==null){
        this.mArrayKursi[mNomor - 1].setmPenumpangBagus(mPenumpang);
    }
        else{
            System.out.println("Maaf kursi nomor"+mNomor+"Sudah ada orangnya silahkan cari lain");
        }
    }

    public String getmKodeBagus() {
        return mKode;
    }

    public void setmKodeBagus(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720146Bagus[] getmArrayKursiBagus() {
        return mArrayKursi;
    }

    public void setmArrayKursiBagus(Kursi1841720146Bagus[] mArrayKursi) {
        this.mArrayKursi = mArrayKursi;
    }
    private void initKursiBagus(){
        for(int i=0; i<mArrayKursi.length; i++){
            this.mArrayKursi[i] = new Kursi1841720146Bagus(String.valueOf(i+1));
        }
    }
    
    public String infoBagus(){
        String infoBagus ="";
        infoBagus += "Kode ; " + mKode + "\n";
        for(Kursi1841720146Bagus kursi : mArrayKursi){
            infoBagus += kursi.infoBagus();
        }
        return infoBagus;
    }
}
