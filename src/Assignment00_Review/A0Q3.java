package Assignment00_Review;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seeds5015
 */
public class A0Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
    Scanner input = new Scanner(System.in);
        System.out.println("Please type in the cost for this event");
    
    double[] cost = new double[6];
    
   
    
        System.out.println("Food");
    cost[0]=input.nextDouble();
        System.out.println("DJ");
    cost[1]=input.nextDouble();
        System.out.println("Hall Rental");
    cost[2]=input.nextDouble();
        System.out.println("Decorations");
    cost[3]=input.nextDouble();    
        System.out.println("Wait Staff");
    cost[4]=input.nextDouble();    
        System.out.println("Miscellaneous Expences");
     cost[5]=input.nextDouble(); 
        
     for (int i = 0; i < 1;i++) {
             
     double money = cost[i] * cost.length;
     
     
     double tickets = 35/money;
         System.out.println(money); 
         System.out.println(tickets); 
     
    }
     
    }
}
