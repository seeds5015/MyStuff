/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment05;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner (System.in);
    
    
    
        System.out.println("please enter the first number");
        int[] numbers = new int[2];
        numbers[0] = input.nextInt();
       
        numbers[1] = input.nextInt();
        
        
 
// state the condistions 
        if (numbers[0] > numbers[1]) {
          
         int temp =numbers[1];
         numbers[1]=numbers[0];
         numbers[0]=temp;

                    }  
//            System.out.println(num2+ " " +num1);
// have you else statment state the other possible conditions 
        
            
        
        System.out.println(numbers[0] + " " + numbers[1]);
     
    
    
    
    
    
    
    
    
}}
