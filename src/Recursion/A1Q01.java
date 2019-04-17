package Recursion;

import java.util.Scanner;

public class A1Q01 {
//set the varabies

    static int ear = 0;

    public static int CountEars(int i) {
        if (i == 0) {
            return ear;
            //determines the number of ears for the odd numbers bunnies
        } else if (i > 0) {
            if (i % 2 == 0) {
                ear = ear + 3;
                //i = i - 1;
                CountEars(i - 1);
                //determines the number of ears for the even bunnies
            } else {
                ear = ear + 2;
                //i = i - 1;
                CountEars(i - 1);
            }
        }
        return ear;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int result;

        System.out.println("Please enter a value: ");
        // stores the number outputted
        num = scan.nextInt();

        result = CountEars(num);
//displays answer
        System.out.println("BunnyEars(" + num + ") = " + result);
    }
}
