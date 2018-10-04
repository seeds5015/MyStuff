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
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System.in);

   System.out.println("Please enter a number to play FizzBuzz");
   int number1 = input.nextInt();
   if(number1%3==0&&number1%5==0){
       System.out.println("you should say FizzBuzz");
   }else if(number1%3==0){
       System.out.println("you should say Fizz");
   }else if(number1%5==0){
       System.out.println("you should say Buzz");   
   }else{
       System.out.println("you should say "+ number1); 
    }    
   }
    
    
    
    
    
    }

