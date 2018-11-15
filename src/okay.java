
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
    System.out.println("Let's play HANGMAN");
   int gamecount=0;
   
        System.out.println("Player one, Please enter a word for player two to guess");
   String word =input.nextLine() ;
   String blank="";
   
   for (int i = 0; i < word.length(); i++){
       blank +="_";
       
   }String misses= "";
        System.out.println("word: "+ blank);
        System.out.println("misses: "+ misses);
        
        while(misses.length()<=6){
            System.out.println("Guss a letter: ");
            String l1 = input.nextLine();
            boolean missedGuessed = hasLetter(misses, l1. upperCase());
            boolean letterAlreadyGuessed = hasLetter(blank, l1.toupperCase());
        }
   
   
        }
    
}
