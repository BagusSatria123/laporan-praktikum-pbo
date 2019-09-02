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
public class Tumbuhansingkong1841720146Bagus extends tumbuhan1841720146Bagus{
    private String tipetanah;
    
    public void settanahtumbuhan(String newValue){
        tipetanah = newValue;        
    }
    public void cetak(){
        super.cetak();
        System.out.println("Tipe Tanah : "+tipetanah);
    }
}
