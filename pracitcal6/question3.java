/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG.pracitcal6;

/**
 *
 * @author cowgoesmoo <thesendmenudes@gmail.com>
 */
public class question3 {
    static boolean isLeapYear(int year) {
        boolean x = year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
        
        return x;
    }
    
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
}
