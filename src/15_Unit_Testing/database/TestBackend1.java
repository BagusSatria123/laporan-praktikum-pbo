/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;


/**
 *
 * @author riza
 */
public class TestBackend1 {
        public static void main(String[] args) {
        Anggota1841720146Bagus ang1 = new Anggota1841720146Bagus("Moh", "Jl. Senggani", "081259720051");
        Anggota1841720146Bagus ang2 = new Anggota1841720146Bagus("Riza", "Jl. Mawar", "08625123523");
        Anggota1841720146Bagus ang3 = new Anggota1841720146Bagus("Zulfahnur", "Jl. Melati", "08125264713");

        // test insert
        ang1.save();
        ang2.save();
        ang3.save();

        // test update
        ang2.setAlamat("Jl. Tak Berarah");
        ang2.save();

        // test delete
        ang3.delete();

        // test select all
        for (Anggota1841720146Bagus a : new Anggota1841720146Bagus().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: "+a.getTelepon());
        }

        // test search
        for (Anggota1841720146Bagus a : new Anggota1841720146Bagus().search("moh")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: "+a.getTelepon());
        }
    }
}
