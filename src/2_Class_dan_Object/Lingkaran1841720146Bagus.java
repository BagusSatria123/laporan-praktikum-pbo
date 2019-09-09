/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uml;

/**
 *
 * @author ROG SERIES
 */
public class Lingkaran1841720146Bagus {
    public String Lingkaran;
    public double phi;
    public double r;
    public double Luas;
    public double kel;
     
    public void hitungLuasBagus(){
        Luas = r * phi;
    }
    public void hitungKelilingBagus(){
        kel  = 2 * r * phi;
        
    }
    public void tampilLingkaranBagus(){
        System.out.println("Lingkaran            : "+Lingkaran);
        System.out.println("phi                  : "+phi);
        System.out.println("Jari-Jari            : "+r);
        System.out.println("Total Hasil Luas     : "+Luas);
        System.out.println("Total Hasil Keliling : "+kel);
    }
}
