/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import static Recursion.A1Q03.count;
import java.util.Scanner;

/**
 *
 * @author Samantha
 */
public class A1Q06 {

    private static int change(double num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
        public String change(String N) {

  // when to stop
  if ( N.length() == 0){
    return N;
  }

  // handle the "special case" using an assumption we can solve str.substring(1)
  if (N.charAt(0) == 'x'){
    return 'y' + change(N.substring(1));
  }
  // handle the "simple" case using an assumption we can solve str.substring(1)
  return N.charAt(0) + change(N.substring(1));
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
           System.out.println("Please enter a value: ");
        // stores the number outputted
            double num = scan.nextDouble();
        
        int results;
     
        
      
         results = change(num);
        
         System.out.println("noX(" + num + ") = " + results);
        
        
        
    }
    
    

}
