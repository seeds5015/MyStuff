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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter in the x cordinate of the first point");
    double users1NumberX =  input.nextDouble();
    System.out.println("Please enter in the Y cordinate of the first point");
    double users1NumberY =  input.nextDouble();
    System.out.println("Please enter in the x cordinate of the second point");
    double users2NumberX =  input.nextDouble();
    System.out.println("Please enter in the y cordinate of the second point");
    double users2NumberY =  input.nextDouble();
    
    double Xpoint = users1NumberX-users2NumberX;
    double Ypoint =users1NumberY-users2NumberY;
    
    
    
    double usersslop = Ypoint/Xpoint;
    
    
    System.out.println("The slope of your line would be " + usersslop);
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    

    
    
}
