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
public class A1Q06 {

    private static double changeX( String num) {
       
    
    
    

  if ( num.length() == 0)
    return 0;
  

  
  if (num.charAt(0) == 'x')
    return 1 + changeX(num.substring(1));
    
    return num.charAt(0) + changeX(num.substring(1));
    }
 
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] arg) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
           System.out.println("Please enter a value: ");
        // stores the number outputted
            double num = scan.nextDouble();
        
        double results;
     
         results = changeX(num);
        
         System.out.println("noX(" + num + ") = " + results);
        
        
        
    }

    
    

}
