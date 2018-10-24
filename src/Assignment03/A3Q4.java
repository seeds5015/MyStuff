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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter an integer greater than 1:");
        // input scanner
        Scanner input = new Scanner(System.in);
        int users1Number = input.nextInt();
        // make you conditions for tour number
        for (int i = 1; i < users1Number; i++) {
            System.out.println("[" + i + "],");
        }
        System.out.println("[" + users1Number + "]");



    }
}
