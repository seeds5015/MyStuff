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
public class A1Q04 {
    
       public static int count(int n){
    if(n == 0)
        return 0;
    else if(n % 10 == 7)
        return 1 + count(n / 10);
    else
        return count(n / 10);
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
        
        int results = count(num);
        
         System.out.println("Coun7(" + num + ") = " + results);
    
    
    
    }
 
}
