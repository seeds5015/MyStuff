/* 
  * To change this license header, choose License Headers in Project Properties. 
  * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
  */ 
 package Assignment01_Recursion; 
 
import static Examples.RecursionExample.pies;

 
 /** 
  * 
  * @author lamon 
  */ 
 public class A1Q1 { 
 
 
     public static int fibLoop(int n){ 
         // creating an array to store possible values 
         int[] ears = new int[n+1]; 
         // set the starting values 
         ears[0] = 1; 
         ears[1] = 1; 
         ears[3] = 1;
         
         
         
        int ears1 = 0;
        //for odd numbers
          for(int i = 0; i <= n; i++){
             ears[i] = ears[i-1] + ears[i-2];
             System.out.println(ears1);
        
        
         } 
         

         // return the answer 
         return ears[n]; 
          
     }
    
    /** 
      * @param args the command line arguments 
      */ 
     public static void main(String[] args) { 
   
   double[] ears = {ears%2==1}; 
         double ears1 = ears(ears, 0); 
       System.out.println(ears1);    
     } 
      
 } 
