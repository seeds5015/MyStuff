
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class LoopMultiplicationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
 int number1 = input.nextInt();
        System.out.println("Please enter another number");
 int number2 = input.nextInt();
 
 int sum = 0;
        for (int i = 0; i < number2; i++) {
            sum= sum + number1;
        }
        System.out.println(sum);
    
    
    
    }
}
