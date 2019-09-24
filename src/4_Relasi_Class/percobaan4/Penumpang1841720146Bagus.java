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
public class Penumpang1841720146Bagus {
     private String mKtp, mNama;

    public Penumpang1841720146Bagus(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getmKtpBagus() {
        return mKtp;
    }

    public void setmKtpBagus(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNamaBagus() {
        return mNama;
    }

    public void setmNamaBagus(String mNama) {
        this.mNama = mNama;
    }

    public String infoBagus(){
        String infoBagus = " ";
        infoBagus += "KTP : " +mKtp+ "\n";
        infoBagus += "Nama : " +mNama+ "\n";
        return infoBagus;
    }
}
