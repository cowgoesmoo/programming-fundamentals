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
public class question4 {

    public static int getInput(String s) {
        String x = JOptionPane.showInputDialog("Please enter the " + s + " integer");
        int num = Integer.parseInt(x);
        return num;
    }

    public static String findMax(int num1, int num2) {
        String y = "1st number is bigger";
        if (num1 < num2) {

            y = "2nd number is bigger";

        } else if (num1 == num2) {
            y = "The 2 numbers are equal";
        }
        return y;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                findMax(getInput("1st"), getInput("2nd")));
    }
}
