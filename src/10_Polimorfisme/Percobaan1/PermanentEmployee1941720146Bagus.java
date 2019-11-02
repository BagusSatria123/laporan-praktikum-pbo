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
public class PermanentEmployee1941720146Bagus extends Employee1841720146Bagus implements Payable1841720146Bagus{
    
    private int salary;

    public PermanentEmployee1941720146Bagus(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }
    
    public int getSalaryBagus() {
        return salary;
    }
    
    public void setSalaryBagus(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountBagus() {
        return (int) (salary+0.05*salary);
    }
    
    @Override
    public String getEmployeeInfoBagus(){
        String info = super.getEmployeeInfoBagus()+"\n";
        info += "Registered as permanent employee with salary : "+salary+"\n";
        return info;
    }
    
    
}
