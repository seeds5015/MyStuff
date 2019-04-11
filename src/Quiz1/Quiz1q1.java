package Quiz1;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seeds5015
 */
public class Quiz1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make a scanner
        Scanner input = new Scanner(System.in);
        // ask for youngest childs age
        System.out.println("Please enter the age of the youngest child");
        int young = input.nextInt();

        // ask for age of middle child
        System.out.println("Please enter the age of the middle child");
        int middle = input.nextInt();

        // determine the difference in age of middle and youngest sibling
        // then add difference to the middle childs age
        int oldest1 = middle - young;
        int oldest = middle + oldest1;
   
        //state the age of the oldest sibling 
        System.out.println("The oldest child will be " + oldest + " years old");




    }
}
