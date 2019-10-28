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
public class PascaSarjana1841720146Bagus extends Mahasiswa1841720146Bagus implements ICumlaude1841720146Bagus{

    public PascaSarjana1841720146Bagus(String nama) {
        super(nama);
    }

    
    
    @Override
    public void lulusBagus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiBagus() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
}
