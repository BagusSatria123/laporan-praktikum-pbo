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
public class Owner1841720146Bagus {
    public void pay(Payable1841720146Bagus p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720146Bagus){
            ElectricityBill1841720146Bagus eb = (ElectricityBill1841720146Bagus) p;
            System.out.println(" "+eb.getBillInfo());
        }
        else if(p instanceof PermanentEmployee1941720146Bagus){
            PermanentEmployee1941720146Bagus pe = (PermanentEmployee1941720146Bagus) p;
            pe.getEmployeeInfo();
            System.out.println(" "+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee1841720146Bagus e){
        System.out.println(" "+e.getEmployeeInfo());
        if(e instanceof PermanentEmployee1941720146Bagus)
            System.out.println("You have to pay her/him monthly!!");
        else
            System.out.println("No need to pay him/her");
        
    }
}
