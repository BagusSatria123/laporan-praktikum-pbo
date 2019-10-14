/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagus.Tugas.Overloading;

/**
 *
 * @author User
 */
public class Segitiga1841720146Bagus {
    private int sudut;
    
    public int totalSudutBagus(int sudutA){
        sudut = 180-sudutA;
        System.out.println("Total Sudut : "+sudut);
        return sudut;
    }
    
    public int totalSudutBagus(int sudutA, int sudutB){
        System.out.println("Total Sudut : "+sudut);
        return sudut;
    }
    
    public int kelilingBagus(int sisiA, int sisiB, int sisiC){
        int kel =  sisiA+sisiB+sisiC;
        System.out.println("Keliling Segitiga : "+kel);
        return kel;
    }
    
    public double kelilingBagus(int sisiA, int sisiB){
        double akar = (Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB));
        System.out.println("Sudut C : "+akar);
        return akar;
    }
}
