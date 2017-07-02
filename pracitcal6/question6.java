/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG.pracitcal6;

import java.util.Scanner;
/**
 *
 * @author cowgoesmoo <thesendmenudes@gmail.com>
 */
public class question6 {
    static boolean isLeapYear(int year) {
        boolean x = year % 400 == 0 || year % 100 != 0 & year % 4 == 0;
        return x;
    }
    
    static int readYear() {
        Scanner hello = new Scanner(System.in);
        int year = hello.nextInt();
        return year;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter starting year: ");
        int year1 = readYear();
        if(year1 == 0 || year1 < 0) {
            System.out.println("Starting year cannot be less than or equals to 0");
            System.out.println("Please enter starting year again");
            System.out.print("Starting year: ");
            year1 = readYear();
        }
        
        System.out.print("Enter ending year: ");
        int year2 = readYear();
        if (year2 <= year1) {
            System.out.println("Ending year cannot be less than starting year");
            System.out.println("Please enter ending year again");
            System.out.print("Ending year: ");
            year2 = readYear();
        }
        
        
        while(year1 < year2) {
            if(isLeapYear(year1)) {
                System.out.println("year" + year1 + " is a leap year");
            } else {
                System.out.println("year" + year1 + " is not a leap year");
            }
            year1++;
        }
    }
}
