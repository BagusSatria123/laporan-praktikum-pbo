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
public class mainplantzombie1841720146Bagus {
    public static void main(String[] args){
    WalkingZombie1841720146Bagus wz = new WalkingZombie1841720146Bagus(100,1);
    jumpingZombie1841720146Bagus jz = new jumpingZombie1841720146Bagus(100,2);
    Barrier1841720146Bagus       b  = new Barrier1841720146Bagus(100);
    Plant1841720146Bagus         p  = new Plant1841720146Bagus();
    
        System.out.println(" "+wz.getZombieInfoBagus());
        System.out.println(" "+jz.getZombieInfoBagus());
        System.out.println(" "+b.getBarrierInfoBagus());
        System.out.println("------------------------");
        
        
        //Destriy the enemies 4 times
        for(int i = 0;i<4;i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(" "+wz.getZombieInfoBagus());
        System.out.println(" "+jz.getZombieInfoBagus());
        System.out.println(" "+b.getBarrierInfoBagus());
    }
}
