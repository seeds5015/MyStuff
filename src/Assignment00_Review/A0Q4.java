package Assignment00_Review;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class A0Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   System.out.println("Please enter a number between 1 and 5");
        Scanner input = new Scanner(System.in);
        int users1Number = input.nextInt();
        while (users1Number < 0 || users1Number > 5) {
            users1Number = input.nextInt();
        }
        // state your conditions 
        for (int i = 1; i <= users1Number; i++) {
            System.out.print("*");
           
           
           }

        
        //to put the finish statment uder the final number
        System.out.println("");
             
         
          
                     
        }
    
    
    
    
    }

