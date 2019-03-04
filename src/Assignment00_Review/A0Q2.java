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
public class A0Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    
    
    
        System.out.println("type in 3 number");
        
    int[] marks = new int[input.nextInt(3)];   
         for (int i = 0; i < marks.length; i++) {
        System.out.println("Please enter a number");
 
        marks[i] = input.nextInt();
         }
         
         
       for (int i = 0; i < marks.length; i++) {
        int marksM = marks[i] * marks[i] * marks[i];
             System.out.println(marksM);
        
       }
       for (int i = 0; i < marks.length; i++) {
           int marksM = marks[i] * marks[i] * marks[i]; 
           
           

           double marksS = Math.pow(marksM,2);
           System.out.println(marksM + " put to the power of 2 is " + marksS);
           
       }
       for (int i = 0; i < marks.length; i++) {
           int marksM = marks[i] * marks[i] * marks[i]; 
           
           

           double marksS = Math.pow(marksM,2);
           
           double markSS = Math.sqrt(marksS);
           System.out.println(marksS + " squard is " + markSS);
       
       
       
       
       
    }
    
    }
    }

