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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter a number between 1 and 5");
        //input your scanner
        Scanner input = new Scanner(System.in);
        int users1Number = input.nextInt();
        while (users1Number < 0 || users1Number > 5) {
            users1Number = input.nextInt();
        }
        // make the conditions for your number 
        for (int i = 1; i <= users1Number; i++) {
            for (int j = 0; j < users1Number; j++) {
                System.out.print("*");
            }
            System.out.println("");


        }
    }
}
