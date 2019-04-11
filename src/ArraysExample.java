
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seeds5015
 */
public class ArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
//int numMarks =10;
//int [] grades = new int [numMarks];
        //create an integer array with five spots
        int[] grades = new int[5];

        //    grades [0]=5;
        //    grades [1]= -1273;
        //use a loop to enter each grade
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a grade");
            grades[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("The grades were");
        for(int i =0; i<5; i++){
        System.out.println(grades[i]);
        }
// add all of the grades
int sum =0;
for(int i =0; i<5; i++){
    sum = sum + grades[i];
}
int average =sum/5;
// sum now has all the marks added up
System.out.println("Average mark is " + average);
        


    }

}
