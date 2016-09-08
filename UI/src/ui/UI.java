/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author majoor
 */
public class UI extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new UI();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(UI.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("User interface 1");
        frame.setContentPane(new Paneel());
    }
    
}
class Paneel extends JPanel {
    private JButton knop;
    private JTextField tekstvak;
    public Paneel(){
        knop = new JButton("Klik");
        KnopHnadler kh = new KnopHnadler();
        knop.addActionListener(kh);
        tekstvak = new JTextField(10);
        
        add(knop);
        add(tekstvak);
    }
    
    class KnopHnadler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tekstvak.setText("Je hebt geklikt");
        }
    }
    
}
