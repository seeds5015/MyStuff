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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer (type-1 to stop)");
        int num1 = input.nextInt();
        int high = 0;
        int low = num1;


        while (num1 != -1) {
            System.out.println("Please enter a positive integer (type-1 to stop)");
            num1 = input.nextInt();

         //make an if statment
            if (num1 < low && num1 != -1) {
                low = num1;
            }
            if (num1 > high) {
                high = num1;
            }
        //state the final answer
        }
        System.out.print("The lowest number was " + low);
        System.out.println("the highest number was " + high);

    }
}
