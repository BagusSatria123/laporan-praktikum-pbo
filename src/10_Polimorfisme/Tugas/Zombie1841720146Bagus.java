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
public class Zombie1841720146Bagus implements Destroyable1841720146Bagus {
    protected int health;
    protected int level;
    
    public void healBagus(){
        System.out.println("the zombie heal standard");
    }   
    
    public String getZombieInfoBagus(){
        String info = "Jenis Zombie : ";
        return info;
        
    }

    @Override
    public void destroyedBagus() {

    }
}
