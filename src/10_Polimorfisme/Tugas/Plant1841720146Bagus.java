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
public class Plant1841720146Bagus {
    public void doDestroy(Destroyable1841720146Bagus d){
        if(d instanceof WalkingZombie1841720146Bagus){
        WalkingZombie1841720146Bagus wz = (WalkingZombie1841720146Bagus) d;
        wz.destroyed();
    }
        else if(d instanceof jumpingZombie1841720146Bagus){
            jumpingZombie1841720146Bagus jz = (jumpingZombie1841720146Bagus) d;
            jz.destroyed();
        }
        else if(d instanceof Barrier1841720146Bagus){
            Barrier1841720146Bagus b = (Barrier1841720146Bagus) d;
            b.destroyed();
        }
    }
    public void showMyZombie(Zombie1841720146Bagus z){
        System.out.println(" "+z.getZombieInfo());
        if(z instanceof WalkingZombie1841720146Bagus)
            System.out.println("You Go need plant potatoes");
    else
            System.out.println("Your home Destroy them");
    }
    
    
}
