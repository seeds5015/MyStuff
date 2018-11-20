
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
   int correct = 0;
   // keeps trak of letters
   char [] letters = new char [word.length()];
    
    int gamecount=0;
   int lives = 6;
   
   
        System.out.println("Player one, Please enter a word for player two to guess");
   String word =input.nextLine() ;
   // the blank spot
   String blank="";
   
   
   
   for (int i = 0; i < word.length(); i++){
       blank +="_";
       
       
       
   }String misses= "";
        System.out.println("word: "+ blank);
        System.out.println("misses: "+ misses);
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("=========");
        
        if (word.char(blank){
            System.out.println("Guss a letter: ");
            String l1 = input.nextLine();
        
    }if (word.contains){
            for (int i = 0; i < word.length(); i++){   
            if (word.charAt(i)== blank) {
                letters[i] = blank;
                
                        correct ++;
            }
        }
   
   
        }
    
}
