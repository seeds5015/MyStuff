/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import static Recursion.A1Q02.triangle;
import java.util.Scanner;

/**
 *
 * @author Samantha
 */
public class A1Q13 {
    
    public boolean groupSum(int start, int[] nums, int tar) {
    if (start == nums.length) {
        if (tar == 0) {
            return true;
        }
        return false;
    }
    if (nums[start] == 6) {
        return groupSum(start + 1, nums, tar - nums[start]);
    }
    if (groupSum(start + 1, nums, tar - nums[start])) {
        return true;
    }
    return groupSum(start + 1, nums, tar);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
          Scanner scan = new Scanner(System.in);
           System.out.println("Please enter a value: ");
        // stores the number outputted
        int num = scan.nextInt();
        
        double results = groupSum(num);
        
         System.out.println("groupSum(" + num + ") = " + results);
        
    }
        // TODO code application logic here
    }
    //tar = target
   
 

