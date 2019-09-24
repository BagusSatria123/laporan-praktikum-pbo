/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagus.relasiclass.percobaan1;

/**
 *
 * @author ROG SERIES
 */
public class MainProcessor1841720146Bagus {
    public static void main(String[] args){
      Processor1841720146Bagus p = new Processor1841720146Bagus("Intel i5", 3); 
      //pertanyaan
      Laptop1841720146Bagus l = new Laptop1841720146Bagus("Thinkpad",p);
      
      Laptop1841720146Bagus l2 = new Laptop1841720146Bagus("Thinkpad",new Processor1841720146Bagus("Intel i5", 3));
      l.info();
      
      //pratikum
      Processor1841720146Bagus p1 = new Processor1841720146Bagus(); 
      p1.setMerkBagus("Intel i5"); 
      p1.setCacheBagus(4); 
      Laptop1841720146Bagus L1 = new Laptop1841720146Bagus(); 
      L1.setMerkLaptopBagus("Thinkpad"); 
      L1.setProcLaptopBagus(p1); 
      L1.info(); 
    }
}
