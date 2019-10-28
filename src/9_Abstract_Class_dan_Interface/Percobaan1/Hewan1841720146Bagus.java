/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9_P1.abstrakclass.Bagus;

/**
 *
 * @author ROG SERIES
 */
public abstract class Hewan1841720146Bagus {
    private int umur;
    
    protected Hewan1841720146Bagus(){
        this.umur = 0;
    }
    
    public void bertambahUmurBagus(){
        this.umur += 1;
    }
    
    public abstract void bergerakBagus();
}
