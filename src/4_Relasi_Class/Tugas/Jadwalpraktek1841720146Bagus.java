/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.Tugas;

/**
 *
 * @author ROG SERIES
 */
public class Jadwalpraktek1841720146Bagus {
    private Dokter1841720146Bagus penyembuh;
    private String HariPraktek;
    private int JamPraktek;

    public Jadwalpraktek1841720146Bagus() {
    }

    public Jadwalpraktek1841720146Bagus(Dokter1841720146Bagus penyembuh, String HariPraktek, int JamPraktek) {
        this.penyembuh = penyembuh;
        this.HariPraktek = HariPraktek;
        this.JamPraktek = JamPraktek;
    }

    public void setPenyembuhBagus(Dokter1841720146Bagus penyembuh) {
        this.penyembuh = penyembuh;
    }

    public void setHariPraktekBagus(String HariPraktek) {
        this.HariPraktek = HariPraktek;
    }

    public void setJamPraktekBagus(int JamPraktek) {
        this.JamPraktek = JamPraktek;
    }

    public Dokter1841720146Bagus getPenyembuhBagus() {
        return penyembuh;
    }

    public String getHariPraktekBagus() {
        return HariPraktek;
    }

    public int getJamPraktekBagus() {
        return JamPraktek;
    }
    
    public String info(){
        String info="";
          info += "Dosen Penyembuh : \n" + this.penyembuh.info();
          info += "hari Praktek  : " + this.HariPraktek + "\n";
          info += "Jam Praktek  : " + this.JamPraktek + "\n"; 
          return info;
    }
}
