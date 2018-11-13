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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter a word");
     String word = input.nextLine();
     //set them to 0
     int x =0;
     int y = 0;
     //set what you want to look for
     while(word.contains("x")|| word.contains("y")){
     //set the counter to count the number of x's
         if(word.contains("x")){
             word=word.replaceFirst("x","");
             x++;
     //set the counter to count the number of y's
         }if(word.contains("y")){
            word= word.replaceFirst("y", "");
             y++;        
         }
         
    //set a condtion
     }if(x<y||x>y){
         System.out.println("This string is not balenced");
    
    }else{
         System.out.println("This string is balenced");
     }
     
        
    }
    }  

