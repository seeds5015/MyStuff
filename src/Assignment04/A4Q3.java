/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment04;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
    
    
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        
        if(word.length ()==1){
            System.out.println("The word with the last characters moved removed is " + word);
        // -2 means it will highlight the last two letters
        }String newWord1 = word.substring(word.length()-2);
        
       // 0,-2 means it will highlight everthing but the last two letters
        String newWord2 = word.substring(0, word.length()-2);
        //places the last two letter infront the other highlighted lettering
        String newWord = newWord1+newWord2;
        System.out.println("The word with the last characters moved removed is " + newWord );
                
             
    
    }
}
