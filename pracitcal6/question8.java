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
public class question8 {

    public static void main(String[] args) {
        int num = readInput();
        int pat = choosePattern();

        switch (pat) {
            case 1:
                printPattern(num);
                break;
            case 2:
                printPattern2(num);
                break;
            case 3:
                printPattern3(num);
                break;
            case 4:
                System.exit(0);
        }
    } //end of main

    static int readInput() {
        int y;
        String x = JOptionPane.showInputDialog("Please enter number of rows");
        y = Integer.parseInt(x);
        return y;
    }

    static int choosePattern() {
        String s = "";
        for (int i = 1; i < 4; i++) {
            s += i + ", Print pattern" + i + "\n";
        }
        s += "4. Exit";
        String a = JOptionPane.showInputDialog(s);

        int x = Integer.parseInt(a);
        return x;
    }

    static void printPattern(int n) {
        for (int y = 1; y < n + 1; y++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

    }

    static void printPattern2(int n) {
        for (int x = 0; x < n; x++) {
            for (int i = 1; i < 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    static void printPattern3(int n) {
        for (int x = 1; x < n + 1; x++) {
            for (int i = x; i <= x * 4; i += x) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
