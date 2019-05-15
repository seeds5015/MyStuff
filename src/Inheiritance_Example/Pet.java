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
public abstract class Pet {

    private String name;
    private int age;
    private String description;

    public Pet(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;

    }

    public abstract void speak();
//    System.out.println("I DONT'T SPEACK");

//}  
    public String toString() {
        String output = this.name + "\n";
        output = output + "Age: " + this.age + "\n";
        output = output + "Desc: " + this.description + "\n";
        return output;
    }

    public String getName() {
        return this.name;

    }

    public int getage() {
        return this.age;
    }

    public String getDescription() {
        return this.description;
    }

}
