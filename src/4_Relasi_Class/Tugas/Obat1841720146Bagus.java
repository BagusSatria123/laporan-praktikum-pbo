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
public class Obat1841720146Bagus {
    private String obat;
    private Pasien1841720146Bagus pasien;
    private Dokter1841720146Bagus dokter;
    private Jadwalpraktek1841720146Bagus jadwal;
    private String namaobat;

    public Obat1841720146Bagus() {
    }

    public Obat1841720146Bagus(String obat, Pasien1841720146Bagus pasien, Dokter1841720146Bagus dokter, Jadwalpraktek1841720146Bagus jadwal, String namaobat) {
        this.obat = obat;
        this.pasien = pasien;
        this.dokter = dokter;
        this.jadwal = jadwal;
        this.namaobat = namaobat;
    }

    public void setObat(String obat) {
        this.obat = obat;
    }

    public void setPasien(Pasien1841720146Bagus pasien) {
        this.pasien = pasien;
    }

    public void setDokter(Dokter1841720146Bagus dokter) {
        this.dokter = dokter;
    }

    public void setJadwal(Jadwalpraktek1841720146Bagus jadwal) {
        this.jadwal = jadwal;
    }

    public void setNamaobat(String namaobat) {
        this.namaobat = namaobat;
    }

    public String getObat() {
        return obat;
    }

    public Pasien1841720146Bagus getPasien() {
        return pasien;
    }

    public Dokter1841720146Bagus getDokter() {
        return dokter;
    }

    public Jadwalpraktek1841720146Bagus getJadwal() {
        return jadwal;
    }

    public String getNamaobat() {
        return namaobat;
    }
    
    public String info(){
        String info = "";         
        info += "Id Pasien : " + this.pasien.info() + "\n";         
        info += "Jadwal kunjungan : " + this.jadwal.info() + "\n";         
        info += "Obat : " + this.namaobat + "\n";         
        return info; 
    }
    
}
