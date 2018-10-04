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
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System.in);
   System.out.println("please enter an integer");
   int users1 = input.nextInt();
   

   if (users1%11==0){
        System.out.println(users1 + " is a special ");
            
   }else if(users1%11==0+1){
        System.out.println(users1 +  " is a special ");
   }else{
        System.out.println(users1 + " is not a special");
   }
    
    
    
    }
    }

