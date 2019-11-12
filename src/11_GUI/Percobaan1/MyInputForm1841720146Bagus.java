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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720146Bagus extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button2;
    private JPanel panel;

    public MyInputForm1841720146Bagus() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai C : ");
        cLabel = new JLabel("Hasil   : ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
        button = new JButton("kali");//untuk membuat tombol "kali"
        button2 = new JButton("Tambah");// membuat tombol "Tambah"

        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
        ActionListener listener2 = new AddInterestListener2();
        button2.addActionListener(listener2);

    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button2);
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        //TODO code application logic here
        JFrame frame = new MyInputForm1841720146Bagus();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

     class AddInterestListener2 implements ActionListener {
         //untuk event klik
        @Override
        public void actionPerformed(ActionEvent arg0) {
            int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
            int b = Integer.valueOf(bField.getText());
            int c = a + b;                     
            cLabel.setText("Hasil; " + c);      
        }

        public AddInterestListener2() {
        }
    }

     class AddInterestListener implements ActionListener {
         //untuk event klik
        @Override
        public void actionPerformed(ActionEvent arg0) {
            int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
            int b = Integer.valueOf(bField.getText());
            int c = a * b;                     
            cLabel.setText("Hasil; " + c);      
        }
     
        }
    }


