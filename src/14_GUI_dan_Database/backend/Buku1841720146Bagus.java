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
public class Buku1841720146Bagus{
    private int idbuku;
    private Kategori1841720146Bagus kategori = new Kategori1841720146Bagus();
    private String judul;
    private String penerbit;
    private String penulis;

    public Buku1841720146Bagus() {
    }

    public Buku1841720146Bagus(Kategori1841720146Bagus kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public Kategori1841720146Bagus getKategori() {
        return kategori;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public void setKategori(Kategori1841720146Bagus kategori) {
        this.kategori = kategori;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    

    public Buku1841720146Bagus getByIdBagus(int id) {
        Buku1841720146Bagus buku = new Buku1841720146Bagus();
        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("SELECT" +" b.idbuku AS idbuku, "+"b.judul AS judul, "+"b.penerbit AS penerbit,"+"b.penulis AS penulis,"+"k.idkategori AS idkategori, "+"k.nama AS nama, "+"k.keterangan AS keterangan"+"FROM buku b"+"LEFT JOIN kategori k ON b.idkategori = k.idkategori"+"WHERE b.idbuku = '"+id+"'");
        
        try {
            while (rs.next()) {
                buku = new Buku1841720146Bagus();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategoriBagus(rs.getInt("idkategori"));
                buku.getKategori().setNamaBagus(rs.getString("nama"));
                buku.getKategori().setKeteranganBagus(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720146Bagus> getAllBagus() {
        ArrayList<Buku1841720146Bagus> ListBuku= new ArrayList();

        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("SELECT "+" b.idbuku AS idbuku, "+"b.judul AS judul, "+"b.penerbit AS penerbit,"+"b.penulis AS penulis,"+"k.idkategori AS idkategori, "+"k.nama AS nama, "+"k.keterangan AS keterangan"+"FROM buku b"+"LEFT JOIN kategori k ON b.idkategori = k.idkategori");

        try {
            while (rs.next()) {
                Buku1841720146Bagus buku = new Buku1841720146Bagus();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategoriBagus(rs.getInt("idkategori"));
                buku.getKategori().setNamaBagus(rs.getString("nama"));
                buku.getKategori().setKeteranganBagus(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

     public ArrayList<Buku1841720146Bagus> searchBagus(String keyword) {
        ArrayList<Buku1841720146Bagus> ListBuku = new ArrayList();


        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("SELECT "+" b.idbuku AS idbuku, "+"b.judul AS judul, "+"b.penerbit AS penerbit,"+"b.penulis AS penulis,"+"k.idkategori AS idkategori, "+"k.nama AS nama, "+"k.keterangan AS keterangan"+"FROM buku b"+"LEFT JOIN kategori k ON b.idkategori = k.idkategori"+"WHERE b.judul LIKE '%"+keyword+"%'"+"OR b.penerbit LIKE '%"+keyword+"%'"+"OR b.penulis LIKE '%"+keyword+"%'" );

        try {
            while (rs.next()) {
                Buku1841720146Bagus buku = new Buku1841720146Bagus();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategoriBagus(rs.getInt("idkategori"));
                buku.getKategori().setNamaBagus(rs.getString("nama"));
                buku.getKategori().setKeteranganBagus(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveBagus() {
        if (getByIdBagus(idbuku).getIdbuku()== 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES(" + " '" + this.judul + "', " + " '" + this.getKategori().getIdkategoriBagus() + "' " +"   '"+this.penulis+"',"+"  '"+this.penerbit+"' "+" )";
            
            this.idbuku = DBHelper1841720146Bagus.insertQueryGetIdBagus(SQL);
        } else {
            String SQL = "UPDATE buku SET " + " judul = '" + this.judul + "', " + " idkategori = '" + this.getKategori().getIdkategoriBagus() + ", " + " penulis = '" + this.penulis + ","+"penerbit= '"+this.penerbit+"'"+"WHERE idbuku = '"+this.idbuku+"'";
            DBHelper1841720146Bagus.executeQueryBagus(SQL);
        }
    }

    public void deleteBagus()
    {
        String SQL = "DELETE FROM kategori WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720146Bagus.executeQueryBagus(SQL);
    }
}
