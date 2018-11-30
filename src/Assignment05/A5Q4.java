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
public class A5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner(System.in);
        System.out.println("type in your 10 numbers");
    int[] grades = new int[10];
    
   
        for (int i = 0; i < 10; i++) {
              
         grades [i] = input.nextInt();
         
         
        
        }for (int i = 0; i < 10; i++) {
            
                    
               
                           
                
                
            }       
         for (int i = 0; i < grades.length -1; i++) {
         if (grades[0] <  grades[i = -1]) {
            int storage  = grades[i];
           grades[i] = grades[i=-1];    
           grades[i=-1]=storage;
           
              
//        }
         
         }
        }    
        
    
    for (int i = 0; i < grades.length ; i++){
        System.out.println(grades[i]);
}
    }
        

} 