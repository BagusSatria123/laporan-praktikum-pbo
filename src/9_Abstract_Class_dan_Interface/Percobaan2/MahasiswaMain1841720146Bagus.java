/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9_P2.Interface.Bagus;

/**
 *
 * @author ROG SERIES
 */
public class MahasiswaMain1841720146Bagus {
    public static void main(String[] args){
        Rektor1841720146Bagus pakRektor = new Rektor1841720146Bagus();
        
        Mahasiswa1841720146Bagus MahasiswaBiasa = new Mahasiswa1841720146Bagus("Charlie");
        Sarjana1841720146Bagus sarjanaCumlaude = new Sarjana1841720146Bagus("Dini");
        PascaSarjana1841720146Bagus masterCumlaude = new PascaSarjana1841720146Bagus("Elok");
        
        
        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);               
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
