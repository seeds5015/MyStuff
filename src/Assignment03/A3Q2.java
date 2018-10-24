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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//input scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base integer");
        int number1 = input.nextInt();
        System.out.println("Please enter the exponent");
        int number2 = input.nextInt();
        //make sum = 1
        int sum = 1;
        for (int i = 0; i < number2; i++) {
            //state the conditions for your number
            sum = sum * number1;
        }
        System.out.println(number1 + "^" + number2 + "=" + sum);





    }
}
