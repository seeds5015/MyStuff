/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Samantha
 */
public class A1Q14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public boolean array(int[] nums) {

return gArray(nums, 0, new int[nums.length], 0, 0, new int[nums.length], 0, 0); 
} 

private boolean gArray(int[] nums, int n, int[] G1, int s1, int t1, int[] G2, int s2, int t2) { 

if (n == nums.length) 
 return t1 == t2; 
//returns true or false

G2[s2] = G1[s1] = nums[n];

return 
gArray(nums, n + 1, G1, s1 + 1, t1 + nums[n], G2, s2, t2) || 
gArray(nums, n + 1, G1, s1, t1, G2, s2 + 1, t2 + nums[n]); 
}
}
