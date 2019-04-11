package Quiz1;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seeds5015
 */
public class Quiz1q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);


        //determine the number of antennas
        System.out.println("How many antennas");
        int numA = input.nextInt();

        //determine the number of eyes
        System.out.println("How many eyes");
        int numE = input.nextInt();

        // state the conditions

        // TroyMartian numA>=3, numE<=4
        if (numA >= 3 && numE <= 4) {
            System.out.println("TroyMartian");

            //GraemeMercurian numA<=2, numE<=3
        }
        if (numA <= 2 && numE <= 3) {
            System.out.println("GraemeMercurian");

            //VladSaturnian numA<=6, numE>=2
        }
        if (numA <= 6 && numE >= 2) {
            System.out.println("VladSaturnian");

            //if nothing works then say not found
        } else {
            System.out.println("None found");

        }




    }
}
