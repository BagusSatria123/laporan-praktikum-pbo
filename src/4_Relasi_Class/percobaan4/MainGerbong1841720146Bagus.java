/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasicalss.percobaan4;

/**
 *
 * @author ROG SERIES
 */
public class MainGerbong1841720146Bagus {
    public static void main(String[] args) {
        Penumpang1841720146Bagus p = new Penumpang1841720146Bagus("12345","Mr.Krab ");
        Gerbong1841720146Bagus gerbong = new Gerbong1841720146Bagus("A", 10);
        gerbong.setPenumpangBagus(p, 1);
        System.out.println(gerbong.infoBagus());
    }
}
