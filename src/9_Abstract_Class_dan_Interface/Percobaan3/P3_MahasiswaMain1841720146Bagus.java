/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9_P3.InterfaceImplementation.Bagus;

/**
 *
 * @author ROG SERIES
 */
public class P3_MahasiswaMain1841720146Bagus {
    public static void main(String[] args){
        P3_Rektor1841720146Bagus pakRektor = new P3_Rektor1841720146Bagus();
        
        //P3_Mahasiswa1841720146Bagus MahasiswaBiasa = new P3_Mahasiswa1841720146Bagus("Charlie");
        P3_Sarjana1841720146Bagus sarjanaCumlaude = new P3_Sarjana1841720146Bagus("Dini");
        P3_PascaSarjana1841720146Bagus masterCumlaude = new P3_PascaSarjana1841720146Bagus("Elok");
        
        //pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);        
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);

        
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
    }
}
