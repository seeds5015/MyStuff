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
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of people heights measured");
        int Nheights = input.nextInt();

//create an inteager for number of people measured
        int[] heights = new int[Nheights];

        //use a loop to enter each heights
        for (int i = 0; i < Nheights; i++) {
            System.out.println("Please enter a height");
            heights[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("The grades were");
        for (int i = 0; i < Nheights; i++) {
            System.out.println(heights[i]);
        }
// add all of the heights
        int sum = 0;
        for (int i = 0; i < Nheights; i++) {
            sum = sum + heights[i];
        }
        int average = sum / Nheights;
// sum now has all the heights added up
        System.out.println("Average heights is " + average);

    }

}
