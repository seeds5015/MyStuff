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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
//        String word = word.replace("a", "");
        
        if(word.contains("a")){
            //replaces the first letter you are looking for
            word = word.replaceFirst("a", "");
            //rplace the first letter but it moves to the second one due to the first on already rplaced
            word = word.replaceFirst("a", "");
        
        }System.out.println("The word with out a is " + word);
    
    
    }
    
}
