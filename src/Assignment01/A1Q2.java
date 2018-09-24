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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println("please enter a temperature you would like to convert in degrees Celsius");
   Scanner input = new Scanner (System.in);
   int users1Number = input.nextInt();
   int degree1Fahrenheit = users1Number * 9;
   int degree2Fahrenheit = degree1Fahrenheit /5;
   int degree3Fahrenheit = degree2Fahrenheit + 32;
   System.out.println(users1Number + "C is the same as " + degree3Fahrenheit + "F");
    
    
    
    
    
    
    
    
    
    }
}
