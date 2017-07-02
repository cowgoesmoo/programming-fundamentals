/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG.pracitcal6;

/**
 *
 * @author cowgoesmoo <thesendmenudes27@gmail.com>
 */
public class question7 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            int math;
            String s = "";
            for (int x = 0; x < 4; x++) {
                math = (int) (Math.random() * 10);
                s += math + " ";
            }
            System.out.println(s);
        }
    }
}
