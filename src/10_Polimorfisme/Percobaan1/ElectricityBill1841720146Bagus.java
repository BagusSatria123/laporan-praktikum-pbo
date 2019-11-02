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
public class ElectricityBill1841720146Bagus extends Employee1841720146Bagus implements Payable1841720146Bagus{
private int kwh;
private String category;

    public ElectricityBill1841720146Bagus(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }
    
     public int getKwhBagus() {
        return kwh;
    }

    public void setKwhBagus(int kwh) {
        this.kwh = kwh;
    }
    
    public String getCategoryBagus() {
        return category;
    }

    public void setCategoryBagus(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmountBagus() {
            return kwh*getBasePriceBagus();
    }
    public int getBasePriceBagus(){
        int bprice = 0;
        switch(category){
            case "R-1" : bprice = 100;break;
            case "R-2" : bprice = 200;break;
        }
    
    return bprice;
    }
    public String getBillInfoBagus(){
        return "KWH ="+kwh+"\n"+
                "Category = "+category+"("+getBasePriceBagus()+"per KWH)\n";
    }
}
