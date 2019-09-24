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
public class Kursi1841720146Bagus {
    private String mNomor;
    private Penumpang1841720146Bagus mPenumpang;

    public Kursi1841720146Bagus(String mNomor) {
        this.mNomor = mNomor;
    }

    public String getmNomorBagus() {
        return mNomor;
    }

    public void setmNomorBagus(String mNomor) {
        this.mNomor = mNomor;
    }

    public Penumpang1841720146Bagus getmPenumpangBagus() {
        return mPenumpang;
    }

    public void setmPenumpangBagus(Penumpang1841720146Bagus mPenumpang) {
        this.mPenumpang = mPenumpang;
    }
    
    public String infoBagus(){
        String infoBagus="";
        infoBagus+="Nomer : "+mNomor+"\n";
        if (this.mPenumpang!=null){
            infoBagus += "Penumpang : \n"+mPenumpang.infoBagus()+ "\n";
        }
        return infoBagus;
    }
}
