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

    public double changeX(String Str) {
       
    
    
    

  if ( Str.length() == 0)
    return 0;
  

  
  if (Str.charAt(0) == 'x')
    return 1 + changeX(Str.substring(1));
    
    return changeX(Str.substring(1));
    }
 
 
 
    /**
     * @param args the command line arguments
     */
    public void main(String[] arg) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
           System.out.println("Please enter a value: ");
        // stores the number outputted
            double Str = scan.nextDouble();
        
        double results;
     
         results = changeX(Str);
        
         System.out.println("noX(" + Str + ") = " + results);
        
        
        
    }
    

    
    

}
