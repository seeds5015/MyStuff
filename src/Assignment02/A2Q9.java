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
public class A2Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       Scanner input = new Scanner (System.in); 
    System.out.println("Enter an integer");
    int a = input.nextInt();
    System.out.println("Enter a second integer");
    int b = input.nextInt();
    System.out.println("Enter a third integer");
    int c = input.nextInt();
    
    
    double a1 = Math.pow(a,2);
    double b1 = Math.pow (b,2);
    double c1 = Math.pow (c,2);
    
    if (a1+b1==c1){
        System.out.println(a + "^2 + " + b + "^2 = "+ c +"^2");
    }else if (a1+c1==b1){
        System.out.println(a + "^2 + " + c + "^2 = "+ b +"^2");
    }else if (c1+b1==a1){
        System.out.println(c + "^2 + " + b + "^2 = "+ a +"^2");
    }else {
        System.out.println("No Pythagorean Triple Found");
    }
    }
}
