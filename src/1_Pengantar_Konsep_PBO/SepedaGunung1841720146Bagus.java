/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo.sepedademo;

/**
 *
 * @author ROG SERIES
 */
public class SepedaGunung1841720146Bagus extends Sepeda1841720146Bagus{
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi: "+tipeSuspensi);
    }
    
}
