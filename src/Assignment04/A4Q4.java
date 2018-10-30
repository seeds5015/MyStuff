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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
    
    
        System.out.println("Please enter word");
    String word = input.nextLine();
    
    //the number of codes starts at zero
    int code =0;
    //what word you want to look for
    while(word.contains("code")){
    //it looking for the first occurence of of the word its looking for     
    int position = word.indexOf("code");
    //when found first occerence of the word move past it to find the word again 
    word =word.substring(position + 1);
    //keep track of the number of times code are present
    code++;
    
    
        
    }System.out.println(code);
    
    
    }
    
}
