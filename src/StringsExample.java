
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class StringsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
  // create a scanner for input

        Scanner input = new Scanner(System.in);


        System.out.println("please enter as word to translate");

        String word = input.nextLine();

        String translated = word.replace("a", "@");

        translated = translated.replace("o", "0");

        translated = translated.replace("ck", "xx");

        translated = translated.replace("s", "z");


        // recreating replace using replacefirst

        while (translated.contains("i")) {

            translated = translated.replaceFirst("i", "1");

        }


        System.out.println(word + " in LEFT is " + translated);


        //indexOf example

        System.out.println("enter a new word");

        String newWord = input.nextLine();


        // search for pp

        int position = newWord.indexOf("pp");

        String Front = newWord.substring(0, position);

        String back = newWord.substring(position + 1);

        String ppremoved = Front + back;


        System.out.println(ppremoved);


    }


 
    
    }

