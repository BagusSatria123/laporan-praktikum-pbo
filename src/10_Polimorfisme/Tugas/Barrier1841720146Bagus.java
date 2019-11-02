/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbomiggu10_tugas.bagus.polimorfisme;

/**
 *
 * @author ROG SERIES
 */
public class Barrier1841720146Bagus implements Destroyable1841720146Bagus{
    private int strength;

    public Barrier1841720146Bagus(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
                strength =  (strength-(int)(strength*0.1));

    }
   
    public String getBarrierInfo(){
        String info = "Barrier Strength : "+getStrength();
    return info;
    
    }
   
    
}
