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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println("Please enter in two integers, on a seperate lines, to divide");
   Scanner input = new Scanner (System.in);
   int users1Number = input.nextInt();
   int users2Number = input.nextInt();
   
   int divided1 = users1Number/users2Number;
   int divided2 = ((users1Number%users2Number));
   
   System.out.println(users1Number + "/" + users2Number + " is " + divided1 + " with a remainder of " + divided2);
 
    
    
    
    
    
    
    
    
    
    }

    private static int inputnextline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
