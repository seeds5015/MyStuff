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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter an integer");
        Scanner input = new Scanner(System.in);
        //create and integer 
        int users1 = input.nextInt();
        System.out.println("Please enter another integer");
        int users2 = input.nextInt();
// state the condistions 
        if (users1 > users2) {
            System.out.println("your biggest number is " + users1);
// have you else statment state the other possible conditions 
        } else if (users2 > users1) {
            System.out.println("your biggest number is " + users2);

        }

    }
}
