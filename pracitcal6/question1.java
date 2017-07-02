/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG.pracitcal6;

import javax.swing.JOptionPane;
/**
 *
 * @author cowgoesmoo <thesendmenudes27@gmail.com>
 */
public class question1 {
    static void printtable(int x) {
        String y = "";
        for (int i = 1; i <= 12; i++) {
            y += x + " x " + i + " = " + i * x + "\n";
            
        }
        JOptionPane.showMessageDialog(null, y);
    }
    
    public static void main(String[] args) {
        printtable(5);
    }
}
