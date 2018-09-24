/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment01;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System.in);
   System.out.println("please enter the A value of your parabola ");
   double usersA = input.nextDouble();
   System.out.println("please enter the B value of your parabola ");
   double usersB = input.nextDouble();
   System.out.println("please enter the C value of your parabola ");
   double usersC = input.nextDouble();
   
   
   double Bsquared = Math.pow(usersB,2);
   double Ax2 = usersA * 2;
   
   double Broot = Bsquared -(4*usersA*usersC);
   double Brootans = Math.sqrt(Broot);
   double topnegative = -usersB -Brootans;
   double toppositive = -usersB + Brootans;
   
   double ansnegative = topnegative/Ax2;
   System.out.println("The negative root is " + ansnegative);
   double anspositive = toppositive/Ax2;
   System.out.println("The positive root is " +  anspositive);
   
    
    
    
    
    
    
    
    
    
    }
}
