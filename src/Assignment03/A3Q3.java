/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment03;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input sanner
        Scanner input = new Scanner(System.in);
//        while (1 == 1) {

        System.out.println("Please enter a number between 1 and 10");
        int users1Number = input.nextInt();
        while (users1Number < 0 || users1Number > 10) {
        // make the conditions
            System.out.println("Please enter a number between 1 and 10");
            users1Number = input.nextInt();
        }
        //state the number that they chosed
        System.out.println("you chose " + users1Number);

    }
}