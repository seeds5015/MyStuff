
import java.util.Scanner;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class PigLatinTransltor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
  Scanner input =new Scanner (System.in);
  
  
  // ask a word to translate
        System.out.println("Please enter a word to translate.");
    String word = input.nextLine();
    // make everything lowercase
    word = word.toLowerCase();
    
   //if the word begins with a vowel
   if (word.startsWith("a") || word.startsWith("i")|| word.startsWith("o") ||word.startsWith("e") || word.startsWith("u")){
       
   
        // dose the word end with a vowel
   if(word.endsWith("a")||word.endsWith("e")||word.endsWith("i")||word.endsWith("u") ||word.endsWith ("o")){
       
   
            // add hay to the end of the word
        System.out.println(word + " in PigLatin it is " + word + "hay");
        // else
   } else{
            // add ay to the end of the word 
        System.out.println(word + " in PigLatin it is " + word + "ay");
   //else (dose not start with vowel
   } else{
        // loop through each character
    int wordLength = word.length();
   for(int i =0; i<wordLength; i++)
       
    {
            // if the character is a vowel 
        char letter = word.charAt(i);
        if(letter == 'a' || letter =='i' ||letter == 'u' || letter == 'o' || letter == 'e' )
                // move all letters before vowel to the end
            String front =word.substring(0,i);
    String back =word.substring(i);
    String newWord = back + front;
                //also  add a ay to the end 
    newWord = newWord + "ay";
        System.out.println(word + " in PigLatin " + newWord );
                // break the loop 
        break;
    }
    
    
    
    

    }
    }
