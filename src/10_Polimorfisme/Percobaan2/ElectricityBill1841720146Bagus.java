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
    
     public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmount() {
            return kwh*getBasePrice();
    }
    public int getBasePrice(){
        int bprice = 0;
        switch(category){
            case "R-1" : bprice = 100;break;
            case "R-2" : bprice = 200;break;
        }
    
    return bprice;
    }
    public String getBillInfo(){
        return "KWH ="+kwh+"\n"+
                "Category = "+category+"("+getBasePrice()+"per KWH)\n";
    }
}
