/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;

/**
 *
 * @author Acer
 */
public class Tester {
    public static void main(String[] args) {
        // parameterized constructors
        Guitar obj1 = new Guitar();
        Guitar obj2 = new Guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood");

        // default constructor
        System.out.println("State of obj1:");
        obj1.createSound();

        // parameterized constructor
        System.out.println("State of obj2:");
        obj2.createSound();

        // setter
        System.out.println("Set price = 3000 of obj1");
        obj1.setPrice(3000);

        // getter
        System.out.println("Get price of obj1: " + obj1.getPrice());
    }
}

