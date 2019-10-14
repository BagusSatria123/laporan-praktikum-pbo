/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagus.overloadingdanoverriding.percobaan1;

/**
 *
 * @author ROG SERIES
 */
public class Manager1841720146Bagus extends Karyawan1841720146Bagus{
    private double tunjangan;
    private String bagian;
    private Staff1841720146Bagus st[];

    public void setTunjanganBagus(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setBagianBagus(String bagian) {
        this.bagian = bagian;
    }

    public void setStBagus(Staff1841720146Bagus[] st) {
        this.st = st;
    }

    public double getTunjanganBagus() {
        return tunjangan;
    }

    public String getBagianBagus() {
        return bagian;
    }  
    

    public void viewStaffBagus(){
        int i;
        
        for (i = 0;i  < st.length; i++) {
            st[i].lihatInfoBagus();
        }
        
    }
    public void lihatInfobagus(){
        System.out.println("Manager         : "+this.getBagianBagus());
        System.out.println("NIP             : "+this.getNipBagus());
        System.out.println("Nama            : "+this.getNamaBagus());
        System.out.println("Golongan        : "+this.getGolonganBagus());
        System.out.printf("Tunjangan        :%.0f\n",this.getTunjanganBagus());
        System.out.printf("Gaji             :%.0f\n",this.getGajiBagus());
        System.out.println("Bagian          : "+this.getBagianBagus());
        this.viewStaffBagus();
    }

    @Override
    public double getGajiBagus() {
        return super.getGajiBagus()+tunjangan; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
