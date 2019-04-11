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
public class Student {
 
    //instance variables/class variables
    private String name;
    private int studentNumber;
    private int grade;
    
    //constructor
    public Student(String sname, int sNumber, int sgrade){
        name = sname;
        studentNumber = sNumber;
        grade = sgrade;
    }
    
    
    // class methods
    public String getName(){
        return name;
    }
     
    public int getstudentNumber(){
       return studentNumber;
    }
    @Override
    public String toString(){
    String output = "Name: " + name + "   StudentNumber: " + studentNumber + "   Grade: " + grade;
return output;    
    }
    
}
