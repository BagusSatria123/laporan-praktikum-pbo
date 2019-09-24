/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.Tugas;

import java.util.Scanner;

/**
 *
 * @author ROG SERIES
 */
public class MainTugas1841720146Bagus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String oyi;
        System.out.println("Apakah Anda sudah Pasien? ");
        oyi = sc.nextLine();
     if(oyi.equals("iya")){
            
        }
        Pasien1841720146Bagus P1 = new Pasien1841720146Bagus(123,"Bagus","Sehat");
        Dokter1841720146Bagus  D1 = new Dokter1841720146Bagus("ggg","tayo");
        Jadwalpraktek1841720146Bagus JP1 = new Jadwalpraktek1841720146Bagus(D1,"Kamis",8);
        Obat1841720146Bagus O1 = new Obat1841720146Bagus("Paramex",P1,D1,JP1,"PIL");
        System.out.println(O1.info());
        
        
        
    }
}

