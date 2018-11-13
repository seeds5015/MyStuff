/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment05;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// Scanner input = new Scanner(System.in);
// int num = input.nextInt();
// 
// int [] Nnum = new int[num];  
//   
//   for (int i = 0; i < num; i++) {
//            System.out.println("Please enter a height");
//            Nnum[i] = input.nextInt(); 
//  String word = input.nextLine();
//       System.out.println("type stop to stop the count");
//  int[] height = new int[word];
//
//   
  Scanner input = new Scanner(System.in);
  //state a system out to ask for a number
        System.out.println("Please enter a positive integer (type-1 to stop)");
        int  numbers = input.nextInt();
       int [] number = new int [input.nextInt()];
        //make a varible for yoyr low and highest numbers
        int high = numbers[0];
        int low = numbers[0];


        for (numbers != -1) {
            System.out.println("Please enter a positive integer (type");
            numbers = input.nextInt();

         //make an if statment
            if (numbers < low && numbers != -1) {
                low = numbers;
            }
            if (numbers > high) {
                high = numbers;
            }
        //state the final answer
        }
        System.out.print("The lowest number was " + low);
        System.out.println("the highest number was " + high);
  
  
  
   }
   
    
    
    
    
    
    
    
    }
    
}
