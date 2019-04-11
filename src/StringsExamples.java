
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class StringsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter an integer");
  int number1 = input.nextInt(); 
  
 
  //clear the buffer
 input.nextLine();
    System.out.println("do you whant to continue");
String answer = input.nextLine();
if(answer.equalsIgnoreCase("yes")){
    System.out.println("i will contine");    
}else {
    System.out.println("Goodbye");
    
}
    
    
    
    
    
    }
}
