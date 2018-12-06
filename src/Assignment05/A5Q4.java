/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment05;

import java.util.Scanner;

/**
 *
 * @author seeds5015
 */
public class A5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        
        
  int n, grade;      
        Scanner s = new Scanner(System.in);
 
  
  
  System.out.println("Enter number of marks");
  
  
  n = s.nextInt();
  
  int a [] = new int[10];
  
        System.out.println("Enter all marks");
  
        for (int i = 0; i <  n; i++) 
            {  
                a[i]=s.nextInt();
            }
            for (int i = 0; i < n; i++) 
                {
        
          
            for (int j = i + 1; j < n; j++)
            {
            if (a[i] >a[j])
            {
                
            grade = a[i];
            a[i]=a[j];
            a[j]= grade;
        }
        }
    
                }
            
for (int i = 0; i < n -1; i++)
{
    System.out.println(a[i] + " , ");
    
    }
System.out.println(a[n -1]);
    
    }
}



 
  

  
  
  
//    int[] grades = new int[5];
//    
//   
//        for (int i = 0; i < 5; i++) {
//              
//         grades [i] = input.nextInt();
//         
//    int storage  = grades[i];     
//        
//        }for (int i = 0; i < 5; i++) {
//    grades[i] = input.nextInt();        
//                    int storage  = grades[i];
//               
//                           
//                
//                
//            }       
//         for (int i = 0; i < grades.length -1; i++) {
//         if (grades[0] <  grades[i = -1]) {
//            int storage  = grades[i];
//           grades[i] = grades[i=-1];    
//           grades[i=-1]=storage;
//           
//              
////        }
//         
//         }
//        }    
//        
//    
//    for (int i = 0; i < grades.length ; i++){
//        System.out.println(grades[i=-1]);
//}
    
        

