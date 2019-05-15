/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheiritance_Example;

/**
 *
 * @author seeds5015
 */
public class petTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog1 = new Dog("Spike", 3, "Black/White Boxer");
        Cat cat1 = new Cat("Fluffy", 5, "Orange/Brown Tabby", 7);

        dog1.speak();
        System.out.println(dog1.getName());
        cat1.speak();
        System.out.println("\n");
        System.out.println(cat1);

        Pet[] zoo = new Pet[3];
        zoo[0] = new Dog("Rex", 8, "Black Lab");
        System.out.println("\n");
        zoo[1] = new Cat("Garfield", 4, " Orange Tabby", 1);
        System.out.println("\n");
        zoo[2] = new Dog("Princess", 1, "Chihuahua");

        //for each pet in the array
        for (Pet p : zoo) {
            p.speak();
//        ask only the dogs to howel
//        cheak for a dog
            if (p instanceof Dog) {
                Dog d = (Dog) p;
                d.howl();

            }

        }
    }

}
