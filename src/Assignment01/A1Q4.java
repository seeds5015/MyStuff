/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment01;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  System.out.println("Please enter the radius of a circle in cm");
   Scanner input = new Scanner (System.in);
   double users1Number =  input.nextDouble();
   
   
   double number1 = Math.pow(users1Number,2);
 
   double number2 = number1*3.14;
 
 
System.out.println("The area of this circle would be " + number2 + "cm squared");
    
    
    
    }
}
