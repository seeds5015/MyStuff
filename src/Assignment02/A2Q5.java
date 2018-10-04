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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner input = new Scanner (System.in);
        System.out.println("Please enter the amount of teas");
            int numberteas = input.nextInt();
        
        System.out.println("Please enter the amount of candies");
            int numbercandies = input.nextInt();
    
      
if (numberteas<=4 || numbercandies<=4){
        System.out.println("That is a bad tea party");      
}else if (numberteas>=10 || numbercandies>=10){
        System.out.println("That is a great tea party");          
  }else if (numberteas>=5 || numbercandies>=5){
        System.out.println("That is a good tea party");
 
    }
    }
        
 
        
        
    
    
    
    
    
    
    }

