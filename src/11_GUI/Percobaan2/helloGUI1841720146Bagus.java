/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1dan2.bagus.gui;

/**
 *
 * @author ROG SERIES
 */
import javax.swing.*;
public class helloGUI1841720146Bagus {
    public static void main(String[] args){
        
        //TODO code application logic here
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Program akan berhenti jika ditutup
            frame.setSize(600, 300);//lebar tinggi windows
            frame.setLocation(200,200);//x,y tampilan pada windows
            //frame.setLocationRelativeTo(null);//menempatkan frame ditengah-tengah layar
            frame.setVisible(true);//untuk menampilkan frame
        
    }
}
