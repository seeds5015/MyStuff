
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class ConditionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // create a scanner for imput
    Scanner input = new Scanner (System.in);
    
  // ask the user for 2 numbers
  System.out.println("please enter two integers on different lines");  
  int Number1 = input.nextInt();
  int Number2 = input.nextInt();
  
  //let the user know which is bigger
  if(Number1>Number2){
      System.out.println("the first number is bigger");
  }else if (Number2 > Number1){
      System.out.println("the second number is bigger");
  }else  {
    System.out.println("those numbers are equal");
}
  //=======================================================================================================================
  // is Number1 is bigger then 10 and Number2
  if(Number1 > 10 && Number1 > Number2){
    System.out.println("Number1 is bigger than 19");
    System.out.println("those numbers are equal");
  }
    
    //if any number was negative
   if(Number1<0 || Number2 < 0){
      System.out.println("A number is negative");
   }
      
      
  }
}
  
  
  
 
