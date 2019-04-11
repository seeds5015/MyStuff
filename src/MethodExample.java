
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seeds5015
 */
public class MethodExample {

    public static void sayHello() {
        System.out.println("Hello World");
    }

    //persons name
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static double areaRect(double length, double width) {
        double area = length * width;
        return area;
    }

    public static String binaryConvert(int num) {
        String answer = "";
        while (num > 0) {
            int remainder = num % 2;
            num = num / 2;
            //reverce them
//            answer = answer + remainder;
            answer = remainder + answer;

        }
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        sayHello();
        System.out.println("please enter name");
        String personsname = input.nextLine();
        sayHello(personsname);

        System.out.println("please enter a length");
        double length = input.nextInt();
        System.out.println("please enter a width");
        double width = input.nextInt();
        double area = areaRect(length, width);
        System.out.println("the area is " + area);

        System.out.println("please enter number to convert");
        double num = input.nextInt();
        String converted = binaryConvert((int) num);
        System.out.println(converted);
    }

}
