/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.inheritance.Percobaan3;

/**
 *
 * @author ROG SERIES
 */
public class Tabung1841720146Bagus extends Bangun1841720146Bagus {
    protected int t;
  
    public void setT(int t) {
        this.t = t;
    }

    public void setSuperPhi(double phi) {
        this.phi = phi;
    }

    public void setSuperR(int r) {
        this.r = r;
    }
    
    public void volume(){
        System.out.println("Volume tabung adalah : "+(super.phi*super.r*super.r*this.t));
    }
    
}
