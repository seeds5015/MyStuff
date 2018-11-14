
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class okay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner (System.in);
    
    String[] wordss = {"writer", "that", "program"};
    
    System.out.println("Player one, Please enter a word for player two to guess.");
    String word = input.nextLine();
    
    Strings char[] enteredLetters = new char [word[wordss].length()];
    
    
    
    
    int triesCount = 0;
    boolean wordguessed = false;
    do
    { switch(enterLetter(word[wordss],enteredLetters))
    
       case 0 : triesCount ++;
            break;
        case 1: 
            triesCount ++;
            break;
        case 2: 
        wordguessed = true;
            break;
    }
    }while (! wordguessed);
        System.out.println("The word is" + word[wordss]);
    
}
