/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment03;

/**
 *
 * @author seeds5015
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
      //make a varible for the sum 
        int sum = 0;
        int count = 1;
        for (int i = 0; i < 100; i++) {
            sum = sum + count;;
            count = count + 2;
        }
        System.out.println(sum);





    }
}
