/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment04;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        //set the letter you want to remove
        String translated = word.replace("a", "");
        //put in your condisions
        while(translated.contains("a")){
        
        }System.out.println("The word with out a is " + translated);
            
    
    
    
    
    
    }
    
}
