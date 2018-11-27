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
// 
 Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of integers you will be ordering");      
int [] number = new int [input.nextInt()];
 System.out.println("Please enter a positive integer");
        
  number [0]= input.nextInt();
        int high = number[0];
        int low = number[0];


        while (number[0] != -1) {
            System.out.println("Please enter a positive integer ");
            number[0] = input.nextInt();

         //make an if statment
            if (number[0] < low && number[0] != -1) {
                low = number[0];
            }
            if (number[0] > high) {
                high = number[0];
            }
        //state the final answer
        }
        System.out.print("The lowest number was " + low);
        System.out.println("the highest number was " + high);






















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
//  Scanner input = new Scanner(System.in);
//  //state a system out to ask for a number
//        
//        //make a varible for yoyr low and highest numbers
//       int low = 0;
//       int high = 1000000;
//       
//System.out.println("Please enter a positive integer (type-1 to stop)");
//
//        for (int i = 0; i <number.length; i++) {
//            System.out.println("Please enter a positive integer (type");
//           int numbers = input.nextInt();
////
//System.out.println("Please enter the number of numbers you wont to type");
//       
//        int [] number = new int [input.nextInt()];
// 
//// state the condistions 
//        if (users1 > users2) {
//            System.out.println("your biggest number is " + users1);
//// have you else statment state the other possible conditions 
//        } else if (users2 > users1) {
//            System.out.println("your biggest number is " + users2);





















//         //make an if statment
//        int high = number[0];
//        int low = numbers0];
//        
//        
//        for (int i =0 ; i < number.length; i++){
//            System.out.println("Please enter a positive integer (type)");
//            if (number < low && number != -1) {
//                low = number;
//            }
//            if (number > high) {
//                high = number;
//            }
//        //state the final answer
//        }
//        System.out.print("The lowest number was " + low);
//        System.out.println("the highest number was " + high);
//  
//  
  
   }
   
    
    
    
    
    
    
    
    }
    
}
