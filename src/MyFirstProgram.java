
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *My First Java Program 
 * @author seeds5015
 */
public class MyFirstProgram {

    /**
     * @param args the command line arguments
     */
    //prints text to screan 
    public static void main(String[] args) {
        System.out.println("HELLO WORLD!");
        System.out.println("SAMMY IS THE BEST");   
        System.out.println("and you know it");
        
//this print, prints text on same line 
System.out.print("what is your name?"); 

//=================================================================================================================================================================================================================================================================================================================================================================================================================================

//Create Scanner For Imput 
Scanner input = new Scanner (System.in);

//=====================================================================================================================================================================================================================================================

System.out.println("(please enter your name)");
//create a string to store the users name 
String usersName = input.nextLine(); 
//output the users name 
System.out.println("Hello " + usersName);

//================================================================================================================================================================================================================================================================

//get the users age 
System.out.println("please Enter Your Age");
int usersAge = input.nextInt();

//========================================================================================================================================================================================

//calculaten approximate birth year 
int birthYear = 2018 - usersAge;
System.out.println("You were born in the year " + birthYear + ".");

//================================================================================================================================================================================================================
//
double a=5;
double ans =a/2;
System.out.println("5/2 is " + ans);



}
}
