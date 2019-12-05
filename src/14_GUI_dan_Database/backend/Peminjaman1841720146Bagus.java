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
import java.sql.ResultSet;
import java.sql.*;

public class Peminjaman1841720146Bagus {

    private int idbuku, idanggota, idpeminjaman;
    private Buku1841720146Bagus buku = new Buku1841720146Bagus();
    private Anggota1841720146Bagus anggota = new Anggota1841720146Bagus();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman1841720146Bagus() {
    }

    public Peminjaman1841720146Bagus(int idbuku, int idanggota, String tanggalpinjam, String tanggalkembali) {
        this.idbuku = idbuku;
        this.idanggota = idanggota;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public Buku1841720146Bagus getBuku() {
        return buku;
    }

    public Anggota1841720146Bagus getAnggota() {
        return anggota;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public void setBuku(Buku1841720146Bagus buku) {
        this.buku = buku;
    }

    public void setAnggota(Anggota1841720146Bagus anggota) {
        this.anggota = anggota;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public Peminjaman1841720146Bagus getByIdBagus(int id) {
        Peminjaman1841720146Bagus peminjaman = new Peminjaman1841720146Bagus();
        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku where p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                Peminjaman1841720146Bagus pem = new Peminjaman1841720146Bagus();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.setIdanggota(rs.getInt("idanggota"));
                pem.setIdbuku(rs.getInt("idbuku"));
                pem.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pem.setTanggalpinjam(rs.getString("tanggalkembali"));
                pem.setAnggota(new Anggota1841720146Bagus().getByIdBagus(pem.getIdanggota()));
                pem.setBuku(new Buku1841720146Bagus().getByIdBagus(pem.getIdbuku()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    public ArrayList<Peminjaman1841720146Bagus> getAllBagus() {
        Peminjaman1841720146Bagus peminjaman = new Peminjaman1841720146Bagus();
        ArrayList<Peminjaman1841720146Bagus> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720146Bagus pem = new Peminjaman1841720146Bagus();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.setIdanggota(rs.getInt("idanggota"));
                pem.setIdbuku(rs.getInt("idbuku"));
                pem.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pem.setTanggalpinjam(rs.getString("tanggalkembali"));
                pem.setAnggota(new Anggota1841720146Bagus().getByIdBagus(pem.getIdanggota()));
                pem.setBuku(new Buku1841720146Bagus().getByIdBagus(pem.getIdbuku()));

                ListPinjam.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveBagus() {
        if (getByIdBagus(idpeminjaman).getIdpeminjaman() == 0) {
            String sql = "Insert into peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggota().getIdanggota() + "', "
                    + "'" + this.getBuku().getIdbuku() + "',"
                    + "'" + this.tanggalpinjam + "', "
                    + "'" + this.tanggalkembali + "' "
                    + ")";
            this.idpeminjaman = DBHelper1841720146Bagus.insertQueryGetIdBagus(sql);
        } else {
            String sql = "Update buku set "
                    + "idanggota = '" + this.getAnggota().getIdanggota() + "', "
                    + "idbuku = '" + this.getBuku().getIdbuku() + "', "
                    + "tanggalpinjam = '" + this.tanggalpinjam + "', "
                    + "tanggalkembali = '" + this.tanggalkembali + "'";
            DBHelper1841720146Bagus.executeQueryBagus(sql);
        }
    }

    public void cariAnggotaBagus(int id) {
        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("Select * from anggota where idanggota = '" + id + "'");
        try {
            while (rs.next()) {
                getAnggota().setIdanggota(rs.getInt("idanggota"));
                getAnggota().setNama(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuAbdulloh(int id) {
        ResultSet rs = DBHelper1841720146Bagus.selectQueryBagus("Select * from buku where idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                getBuku().setIdbuku(rs.getInt("idbuku"));
                getBuku().setJudul(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBagus() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720146Bagus.executeQueryBagus(SQL);
    }
}
