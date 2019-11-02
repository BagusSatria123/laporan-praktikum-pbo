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
public class Testerfour1841720146Bagus {
    public static void main(String[] args){
        Owner1841720146Bagus ow = new Owner1841720146Bagus();
        ElectricityBill1841720146Bagus eBill = new ElectricityBill1841720146Bagus(5,"R-1");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("------------------------------------------------------------");
        
        PermanentEmployee1941720146Bagus pEmp = new PermanentEmployee1941720146Bagus(500,"Dedik");
        ow.pay(pEmp);//pay for permanent employee
        System.out.println("------------------------------------------------------------");
        
        InternshipEmployee1841720146Bagus iEmp = new InternshipEmployee1841720146Bagus("Sunarto",5);
        ow.showMyEmployee(pEmp);// show for permanent employee info
        System.out.println("------------------------------------------------------------");
        ow.showMyEmployee(iEmp);// show for Internship employee 
        
        //ow.pay(iEmp);
    }
}
