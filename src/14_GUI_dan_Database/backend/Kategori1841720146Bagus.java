/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author ROG SERIES
 */
import java.util.ArrayList;
import java.sql.*;

public class Kategori1841720146Bagus {

    private int idkategori;
    private String nama;
    private String keterangan;

    public Kategori1841720146Bagus() {
    }
    
    @Override
    public String toString(){
        return nama;
    }

    public Kategori1841720146Bagus(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getIdkategoriBagus() {
        return idkategori;
    }

    public String getNamaBagus() {
        return nama;
    }

    public String getKeteranganBagus() {
        return keterangan;
    }

    public void setIdkategoriBagus(int idkategori) {
        this.idkategori = idkategori;
    }

    public void setNamaBagus(String nama) {
        this.nama = nama;
    }

    public void setKeteranganBagus(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720146Bagus getByIdBagus(int id) {
        Kategori1841720146Bagus kat = new Kategori1841720146Bagus();
        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720146Bagus();
                kat.setIdkategoriBagus(rs.getInt("idkategori"));
                kat.setNamaBagus(rs.getString("nama"));
                kat.setKeteranganBagus(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720146Bagus> getAllBagus() {
        ArrayList<Kategori1841720146Bagus> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720146Bagus kat = new Kategori1841720146Bagus();
                kat.setIdkategoriBagus(rs.getInt("idkategori"));
                kat.setNamaBagus(rs.getString("nama"));
                kat.setKeteranganBagus(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

     public ArrayList<Kategori1841720146Bagus> searchBagus(String keyword) {
        ArrayList<Kategori1841720146Bagus> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus(sql);

        try {
            while (rs.next()) {
                Kategori1841720146Bagus kat = new Kategori1841720146Bagus();
                kat.setIdkategoriBagus(rs.getInt("idkategori"));
                kat.setNamaBagus(rs.getString("nama"));
                kat.setKeteranganBagus(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveBagus() {
        if (getByIdBagus(idkategori).getIdkategoriBagus() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + " '" + this.nama + "', " + " '" + this.keterangan + "' " + " )";
            this.idkategori = DBHelper1841720146Bagus.insertQueryGetIdBagus(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + " nama = '" + this.nama + "', " + " keterangan = '" + this.keterangan + "' " + " WHERE idkategori = '" + this.idkategori + "'";
            DBHelper1841720146Bagus.executeQueryBagus(SQL);
        }
    }

    public void deleteBagus()
    {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720146Bagus.executeQueryBagus(SQL);
    }
    
}
