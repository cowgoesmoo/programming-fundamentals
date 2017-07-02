/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG.pracitcal6;

import javax.swing.JOptionPane;
/**
 *
 * @author cowgoesmoo <thesendmenudes@gmail.com>
 */
public class question2 {
    
    static String getInput() {
        String input = JOptionPane.showInputDialog("Enter rank");
        return input;
    }
    
    static void printPrize(int rank) {
        switch (rank) {
            case 1: 
                System.out.println(rank + "st prize is $10000");
                break;
            case 2:
                System.out.println(rank + "nd prize is $5000");
                break;
            case 3:
                System.out.println(rank + "rd prize is $1000");
                break;
            default:
                System.out.println("no money");
        }
    }
    
    public static void main(String[] args) {
        printPrize(Integer.parseInt(getInput()));
        
    }
    
}
