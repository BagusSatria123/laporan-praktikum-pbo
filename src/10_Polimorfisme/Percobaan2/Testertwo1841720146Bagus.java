/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu10_p1.bagus.polimorfisme;

/**
 *
 * @author ROG SERIES
 */
public class Testertwo1841720146Bagus {
    public static void main(String[] args){
        PermanentEmployee1941720146Bagus pEmp = new PermanentEmployee1941720146Bagus(500,"Dedik");
        Employee1841720146Bagus e;
        e = pEmp;
        System.out.println(" "+e.getEmployeeInfo());
        System.out.println("===========================");
        System.out.println(" "+pEmp.getEmployeeInfo());
    }
    
}
