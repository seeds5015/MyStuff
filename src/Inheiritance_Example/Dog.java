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
public class Dog extends Pet {

    public Dog(String name, int age, String description) {
        super(name, age, description);
    }

    public void speak() {
        System.out.println("WOOF WOOF");

    }

    public void howl() {
        System.out.println("HOOOOOWWWEEEEEEELLL");
    }

}
