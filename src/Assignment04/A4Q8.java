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
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter a word");
    String word = input.nextLine();
    
    
    String reverse = "";
    
    
    
    
    for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);

    
    }System.out.println("This string backwords is " + reverse);
    }    
}
