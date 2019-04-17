/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Samantha
 */
public class A1Q02 {
    public static int triangle (int rows) {
  int num = 0;
  if (rows == 0) {
    return num;
  } else {
    num = num + rows;
    num = num + triangle(rows - 1);
  }
  return num;
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
        
        int results = triangle(num);
        
         System.out.println("triangle(" + num + ") = " + results);
      
    
    
    }
 
   
}
//public int triangle(String[] args) {
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
//         System.out.println("triangle(" + num + ") = " + results);
//        return 1;
//     }


