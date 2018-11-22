
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
//   int correct = 0;
//   // keeps trak of letters
//   char [] letters = new char [word.length()];
//    
//    int gamecount=0;
//   int lives = 6;
   
   // creating hangman
   
   //hanyman drawing
   
   System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("        |");
        System.out.println("=========");
        
        //start adding heads  
//        System.out.println("  +-------+");
//        System.out.println("  |       |");
//        System.out.println("  0       |");
//        System.out.println("          |");
//        System.out.println("          |");
//        System.out.println("          |");
//        System.out.println("  =========");
//        
//        //keep adding body parts when guess is wrong
//        System.out.println("  +-------+");
//        System.out.println("  |       |");
//        System.out.println("  0       |");
//        System.out.println("  |       |");
//        System.out.println("          |");
//        System.out.println("          |");
//        System.out.println("  =========");
//        
//        
//        System.out.println("  +-------+");
//        System.out.println("  |       |");
//        System.out.println("  0       |");
//        System.out.println("  |\\      |");
//        System.out.println("          |");
//        System.out.println("          |");
//        System.out.println("  =========");
//        
//         System.out.println("  +-------+");
//        System.out.println("  |       |");
//        System.out.println("  0       |");
//        System.out.println(" /|\\      |");
//        System.out.println("          |");
//        System.out.println("          |");
//        System.out.println("  =========");
//        
//         System.out.println("  +-------+");
//        System.out.println("  |       |");
//        System.out.println("  0       |");
//        System.out.println(" /|\\      |");
//        System.out.println("   \\      |");
//        System.out.println("          |");
//        System.out.println("  =========");
//        
//        //once their is a full body the game is over
//          System.out.println("  +-------+");
//        System.out.println("  |       |");
//        System.out.println("  0       |");
//        System.out.println(" /|\\      |");
//        System.out.println(" / \\      |");
//        System.out.println("          |");
//        System.out.println("  =========");
        
   //track the letter
   char [] guesses = new char[30];
   
   //player one will type a word for player to too guess
    System.out.println("Player one, Please enter a word for player two to guess");
   int correct = 0;
    String word =input.nextLine() ;
   
    char[] letters = new char[word.length()];
   for (int i = 0; i < letters.length; i++){
       letters [i] ='_';    
   }
    System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
   System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   //players only have 6 lives
   int lives = 6;
   // when p[layer has no more lives then game over
   while (lives >0){
       System.out.println("");
       System.out.println("Guss a letter: ");
       char guess = input.nextLine().charAt(0);
       String G = "" + guess;
       //letters that are incorect
       if(!word.contains(G)){
           lives --;
           System.out.println("player 2 you have " +lives + " life left.");
       }
       //gameover
       if(lives == 0){
           //show the correct word 
           System.out.println("player 2 lost");
           System.out.println(word);

   }
   
       // if the letters are corect
if(word.contains(G)){
    for (int i = 0; i < word.length(); i++) {
        //check each letter in word
        if (word.charAt(i)== guess) {
            letters[i]=guess;
            
          //check the correct letters
          correct++;
          
        }
    }

}
       for (int i = 0; i < word.length(); i++) {
           System.out.println(letters[i]);  
       }
       //if player 2 guess the word correct
       System.out.println("");
       if (correct==word.length()) {
           System.out.println("player 2 wins");
       break;
       }
//   String misses= "";
//        System.out.println("word: "+ blank);
//        System.out.println("misses: "+ misses);
//        System.out.println("+-------+");
//        System.out.println("|       |");
//        System.out.println("        |");
//        System.out.println("        |");
//        System.out.println("        |");
//        System.out.println("        |");
//        System.out.println("=========");
//        
//        if (word.char(blank){
//            System.out.println("Guss a letter: ");
//            String l1 = input.nextLine();
//        
//    }if (word.contains){
//            for (int i = 0; i < word.length(); i++){   
//            if (word.charAt(i)== blank) {
//                letters[i] = blank;
//                
//                        correct ++;
            }
            
            
            
            
            
          
        }
   
   
        }
    
}
