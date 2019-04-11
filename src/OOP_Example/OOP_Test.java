/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Example;

/**
 *
 * @author seeds5015
 */
public class OOP_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student[] classRoom = new Student[30];
        
   Student s1 = new Student("Steve", 007, 10);
   Student s2 = new Student("lary", 025, 11);
   
        System.out.println(s1.getName());
    System.out.println(s2.getName());
    
    
        System.out.println(s1);
    }
    
    
}
