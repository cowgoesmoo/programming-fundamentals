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
public class question5 {
    static void add(String one, String two) {
        JOptionPane.showMessageDialog(null,
                one + " " + two);
    }
    
    static void add(double one, double two) {
        JOptionPane.showMessageDialog(null,
                one + " + " + two + " = " + (one + two));
    }
    
    public static void main(String[] args) {
        add("Harry", "Potter");
        add(5.6, 3.2);
    }
    
}
