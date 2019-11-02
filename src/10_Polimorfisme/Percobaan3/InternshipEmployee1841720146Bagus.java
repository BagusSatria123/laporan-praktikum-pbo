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
public class InternshipEmployee1841720146Bagus extends Employee1841720146Bagus implements Payable1841720146Bagus{
    private int length;
    
    public InternshipEmployee1841720146Bagus(String name,int length){
        this.name = name;
        this.length = length;
        
    }
    public int getLengthBagus() {
        return length;
    }

    public void setLengthBagus(int length) {
        this.length = length;
    }
 
    @Override
    
    public String getEmployeeInfoBagus(){
        String info = super.getEmployeeInfoBagus()+"\n";
        info += "Registered as internship employee for"+length+"month/s\n";
        return info;
    }

    @Override
    public int getPaymentAmountBagus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
