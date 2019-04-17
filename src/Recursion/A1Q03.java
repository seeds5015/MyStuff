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
    
     public static int count (int num) {
        int count=0;
        boolean doubl = false;
        while(true) {
            int n = num%10;
            num = num/10;

            if(n==8) {

                if(doubl) {
                    count = count+2;
                } else {
                    count++;
                }
                doubl=true;
            }
            else {
                doubl=false;
            }
            if(num == 0) break;
        }
        return count;
        
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
     
        
      
         results = count(num);
        
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

    private static int num(int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
