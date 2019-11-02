/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the epublic WalkingZombie1841720146Bagus(int health, int level) {
        this.health = health;
        this.level = level;
        
    }
    @Override
    public void heal(){
        switch(level){
            case 1:
                health = (int) (health+health*0.2);
                break;
            case 2:
                health = (int) (health+health*0.3);
                break;
            case 3:
                health = (int) (health+health*0.4);
               
        }
    }
    
    @Override
    public void destroyed() {
                health =  (health-(int)(health*0.2));

    }
    
    @Override
    public String getZombieInfo(){
        String info = super.getZombieInfo()+"\n";
        info += "Registered as walking zombie with health"+health+"and level"+level+"\n";
    return info;
    
    }ditor.
 */
package pbomiggu10_tugas.bagus.polimorfisme;

/**
 *
 * @author ROG SERIES
 */
public class WalkingZombie1841720146Bagus extends Zombie1841720146Bagus {

    public WalkingZombie1841720146Bagus(int health, int level) {
        this.health = health;
        this.level = level;
        
    }
    @Override
    public void healBagus(){
        switch (level){
            case 1:
                health = (int) (health+health*0.2);
                break;
            case 2:
                health = (int) (health+health*0.3);
                break;
            case 3:
                health = (int) (health+health*0.4);
               
        }
    }
    
    @Override
    public void destroyedBagus() {
                health =  (health-(int)(health*0.2));
    }
    
    @Override
    public String getZombieInfoBagus(){
        String info = super.getZombieInfoBagus()+"\n";
        info += " Walking zombie Data : \n"+" health = "+health+"\n"+"level ="+level+"\n";
    return info;
    
    }
}
