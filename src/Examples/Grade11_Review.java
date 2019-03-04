/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class Grade11_Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//type words 
        System.out.println("uiuiui");
        System.out.print("HELLO, I AM YOUR MASTER");
        System.out.println(" ha ha ha");

//scanner for system input
        Scanner input = new Scanner(System.in);
        
//ask what you want       
        System.out.println("what is your name?");
        String playername = input.nextLine();
        
        
        System.out.println("Welcome " + playername);
        
        System.out.println("what is your brith year?");
        
        int yearborn = input.nextInt();
        
        int age = 2019 - yearborn;
        System.out.println("you are "+ age +" years old");
        
        if (age>30){
            System.out.println("your old");
        }else if(age<5){
            System.out.println("loser");
            
        }else if(age<20 && age>6){
            System.out.println("you are a teen");
        }else{
            System.out.println("booo");   
        }
 //to be able to type again
        input.nextLine();
        System.out.println("what is your name again?");
        String namea = input.nextLine();
        
        
        
        
 //get users mark and calculater the average
 //[] = arrays
        double[]marks = new double[5];
        System.out.println("type in 5 marks");
        
        marks[0] = 85.5;
        
        System.out.println("Please enter a mark");
 //i++ means add one each time
 // you dont have to write out each array
        for(int i =0; i < marks.length; i ++){
 //scanning a mark into an array spot
           marks[i]=input.nextDouble(); 
        }
 //an accumulator for total amount of marks       
        double total=0;
 //make a while loop like a forn loop
        int spot=0;
        while(spot<marks.length){
            total=total+marks[spot];
 //moveing spot ahead one          
            spot++;
        }double average = total/marks.length;
        System.out.println("the average mark is "+ average);
//how to make Strings equal
   
        if(playername.equals("sammy")){
        System.out.println("Hello Master");
    }
    }
    
    
    
    
   }