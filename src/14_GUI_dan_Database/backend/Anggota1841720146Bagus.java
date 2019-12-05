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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class Anggota1841720146Bagus {

   private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota1841720146Bagus() {
    }
    
    @Override
    public String toString(){
        return nama;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720146Bagus( String nama, String alamat, String telepon) {
        
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
   

    public Anggota1841720146Bagus getByIdBagus(int id) {
        Anggota1841720146Bagus kat = new Anggota1841720146Bagus();
        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Anggota1841720146Bagus();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Anggota1841720146Bagus> getAllBagus() {
        ArrayList<Anggota1841720146Bagus> listAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720146Bagus kat = new Anggota1841720146Bagus();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));

                listAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }

     public ArrayList<Anggota1841720146Bagus> searchBagus(String keyword) {
        ArrayList<Anggota1841720146Bagus> listAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%"+ keyword + "%' ";

        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus(sql);

        try {
            while (rs.next()) {
                Anggota1841720146Bagus kat = new Anggota1841720146Bagus();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));

                listAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }

    public void saveBagus() {
        if (getByIdBagus(idanggota).getIdanggota()== 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.nama + "', " + " '" + this.alamat + "', "+" '" + this.telepon + "' "+" )";
            this.idanggota = DBHelper1841720146Bagus.insertQueryGetIdBagus(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.nama + "', " + " alamat = '" + this.alamat + "', " + " telepon = '" + this.telepon + "' " +" WHERE idanggota = '" + this.idanggota + "'";
            DBHelper1841720146Bagus.executeQueryBagus(SQL);
        }
    }

    public void deleteBagus()
    {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper1841720146Bagus.executeQueryBagus(SQL);
    }
  
}
