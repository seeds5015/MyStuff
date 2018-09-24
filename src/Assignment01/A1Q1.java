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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
System.out.println("please enter two integers on seperate lines to run calclations ");
Scanner input = new Scanner (System.in);
int users1Number = input.nextInt();
int users2Number = input.nextInt();

 
int sum = users1Number + users2Number;
System.out.println("The sum of " + users1Number + "+" + users2Number + " is " + sum);
  
int product = users1Number * users2Number;
System.out.println("The product of " + users1Number + "x" + users2Number + " is " + product);

        
    
    
    }
}
