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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter a word");
        String word = input.nextLine();
        String letter = "";
        
//        String withoutfirstletter = letter.substring(1);
//        String withoutlastletter = letter.substring(0, letter.length() - 1);
        
        if(word.length ()==1){
            System.out.println("");
        }else {
            String newWord = word.substring(1, word.length()-1);
        System.out.println("The word with the outside characters removed is " + newWord);
        }        
            
        }}
    

