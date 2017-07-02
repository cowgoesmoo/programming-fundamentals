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
    static void printTable(int x) {
        
        String y = ""; //initialise y
        
        for (int i = 1; i <= 12; i++) {
            y += x + " x " + i + " = " + i * x + "\n";
        }//end of for loop
        
        JOptionPane.showMessageDialog(null, y);
    }//end of method printTable
    
    public static void main(String[] args) {
        printtable(5);
    } //end of main
}
