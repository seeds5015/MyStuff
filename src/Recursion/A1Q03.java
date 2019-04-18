/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import static Recursion.A1Q02.triangle;
import java.util.Scanner;

/**
 *
 * @author Samantha
 */
public class A1Q03 {
    
     public static int sumDigits(int num) {
//     

       if (num < 10)
           return num;
           return sumDigits(num/10)+ num%10;
       }
        
     
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
           System.out.println("Please enter a value: ");
        // stores the number outputted
        int num = scan.nextInt();
        
        int results;
     
        
      
         results = sumDigits(num);
        
         System.out.println("sumDigit(" + num + ") = " + results);
        
        
        
    }
   

   
//    public int count(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num;
//        
//        int results;
//        
//        
//        System.out.println("Please enter a value: ");
//        // stores the number outputted
//        num = scan.nextInt();
//        
//        results = count(num);
//        
//         System.out.println("SumDigits(" + num + ") = " + results);
//        return 1;
//     }


}
