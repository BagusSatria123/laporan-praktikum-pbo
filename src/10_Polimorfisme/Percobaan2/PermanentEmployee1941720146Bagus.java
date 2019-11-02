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
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary+0.05*salary);
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary : "+salary+"\n";
        return info;
    }
    
    
}
