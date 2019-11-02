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
public class Testerthree1841720146Bagus {
    public static void main(String[] args){
        PermanentEmployee1941720146Bagus pEmp = new PermanentEmployee1941720146Bagus(500,"Dedik");
        InternshipEmployee1841720146Bagus iEmp = new InternshipEmployee1841720146Bagus ("Sunarto",5);
        ElectricityBill1841720146Bagus eBill = new ElectricityBill1841720146Bagus(5, "A-1");
        
       Employee1841720146Bagus e[] = {pEmp,iEmp};
       Payable1841720146Bagus p[] = {pEmp,eBill};
       Employee1841720146Bagus e2[] = {pEmp,iEmp,eBill};
        
       
    }
}
