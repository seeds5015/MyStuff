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
public class A3Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the number game");
        System.out.println("Please enter your guess between 1 and 100");
        int num1 = input.nextInt();
        //use Math. to pick a random number 
        int number = (int) (Math.random() * 100 + 1);

        while (num1 > 100 || num1 < 0) {
            System.out.println("Please enter your guess between 1 and 100");
// make your while statment
        }
        while (num1 != number) {
            if (number < num1) {
                System.out.println("too high");

            } else if (number > num1) {
                System.out.println("too low");
            }
            System.out.println("Please enter your guess between 1 and 100");
            num1 = input.nextInt();
//make your final if statment
            if (number == num1) {
                System.out.println("correct");
            }
        }
    }
}
