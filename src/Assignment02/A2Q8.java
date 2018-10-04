/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A2Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner (System.in);
  System.out.println("Enter speed limit");
  int limit = input.nextInt();
  System.out.println("Enter the recorded speed of the car");
  int recorded = input.nextInt();
  
  
  int diff = recorded-limit;
  
  
  if (recorded < limit){
      System.out.println("Congratulations, you are within the speed limit! ");
   
      
      
  
  }else if (diff>30){
      System.out.println("You are speeding and your fine is $500");
  }else if (diff<30&&diff>10){
      System.out.println("You are speeding and your fine is $270");
  }else if(diff<20){
      System.out.println("You are speeding and your fine is $100");
  }
    
    
    
    
    
    
    }
}
