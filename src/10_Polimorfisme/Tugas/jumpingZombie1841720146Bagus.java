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
public class jumpingZombie1841720146Bagus extends Zombie1841720146Bagus{
    public jumpingZombie1841720146Bagus(int health, int level) {
        this.health = health;
        this.level = level;
        
    }
    @Override
    public void healBagus(){
        switch(level){
            case 1:
                health = (int) (health+health*0.3);
                break;
            case 2:
                health = (int) (health+health*0.4);
                break;
            case 3:
                health = (int) (health+health*0.5);
               
        }
    }
    
    @Override
    public void destroyedBagus() {
                health =  (health-(int)(health*0.1));

    }
    
    @Override
    public String getZombieInfoBagus(){
        String info = super.getZombieInfoBagus()+"\n";
        info += " Jumping zombie Data : \n"+" health = "+health+"\n"+"level ="+level+"\n";
    return info;
    
    }
    
}
