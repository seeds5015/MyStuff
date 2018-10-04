/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    System.out.println("Please enter an iteger");
    Scanner input = new Scanner (System.in);
    int number1 = input.nextInt();
    System.out.println("Please enter anoth integer");
    int number2 = input.nextInt();
    if (number1>number2){
System.out.println("your number in ascending order are "+ number2 + ","+ number1);

    }else if (number1<number2)
        System.out.println("your number in ascending order are "+ number1 + ","+ number2);
}
    }