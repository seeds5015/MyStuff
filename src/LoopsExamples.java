
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class LoopsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
 //create a count varible 
    int count = 0;
   
 //while loop condition
    while (count<10){
       System.out.println("count: " + count);
 //add 1 to the count varible      
       count = count + 1;
    }
 //after the loop is over
    System.out.println("All done!");
    
 //======================================================================================================================
//reuse the count varible
     count = 0;
     do {
         System.out.println("count: "+ count);
         count = count + 1;
     }while (count <10); 
    
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a number between 1 and 10");
    int num = input.nextInt();
    //verify it is good
    while (num < 1|| num >10){
        System.out.println("Try again. BETWEEN 1 AND 10");
        num = input.nextInt();
    }
    
    
    
   //=========================================================================================================================
    //a for loop
    for(int i =+ 0; i<10; i++){
        System.out.println("count: "+ i);
    }
    
    
    
    
    
    //=================================================================================================================================
    
    //using loop for error catching
    while(1==1){
        System.out.println("enter a number between 1 and 10");
        
    int number = input.nextInt();
    if(number == 1337)
        break;
    }
    //a sum varible to add everything into
    int sum =0;
    //get five marks
    for(int i = 0; i <5; i++){
        System.out.println("Please enter a mark");
        int mark = input.nextInt();
        //add mark into sum
        sum = sum + mark;
    }
   
    
    
    
    
    
   
     }
     }
