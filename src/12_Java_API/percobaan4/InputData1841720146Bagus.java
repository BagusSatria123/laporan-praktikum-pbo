/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagus.percobaan4;

/**
 *
 * @author ROG SERIES
 */
import java.util.ArrayList;
public class InputData1841720146Bagus {
    ArrayList<Mahasiswa1841720146Bagus> ListMahasiswa;

   

    public InputData1841720146Bagus() {
        ListMahasiswa = new ArrayList();
    }

    public void isiDataBagus(String Nim, String Nama,String Alamat){
        Mahasiswa1841720146Bagus mhs = new Mahasiswa1841720146Bagus(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720146Bagus> getData(){
        return ListMahasiswa;
    }
}
