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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();
        String letter="";
       if(word.length ()==1){
           System.out.println("The first two letters are " + word); 
       
       }else{
          
           for(int i =0; i < 2 ;i++){
               char letters = word.charAt(i);
               
              letter=letter+word.charAt(i);
                       
           }System.out.println("The first two letter are " + letter); 
       }
    
    
       }
    
}

