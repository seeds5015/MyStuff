/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
  //
   Scanner input = new Scanner (System.in);
   
        System.out.println("Please enter a number representing the day of the week(0=Sun, 1=Mon, 2=Tue,... 6=Sat)");
  int day = input.nextInt();
  
  //put input.nextLINE(); TO ALLOW THE STRING TO TYPE
  input.nextLine();
        System.out.println("is today a holidat?(yes/no)");
  String ny = input.nextLine();
  
  if (ny.equalsIgnoreCase("yes")|| day==0||day==6){
          System.out.println("you should wake up at 10:00");
          
  } else if (ny.equals("no")&&day == 1||day==2||day==3||day==4||day==5){
      System.out.println("you should wake up at 7:00");
          
      }
//  }else if (ny.equals("yes")&&day==0||day ==1||day==2||day==3||day==4||day==5||day==6){
//      System.out.println("you should wake up at 10:00");
//  }else if(day==0||day==6&&ny.equals("yes||no")){
//        System.out.println("You should wake up at 10:00");
    }
   
    
    
    

    }

