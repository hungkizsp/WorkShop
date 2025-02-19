/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;

/**
 *
 * @author Acer
 */
public class GuitarTest {
     public static void main(String[] args) {
        // parameterized constructor
        Guitar guitar = new Guitar("SN12345", 1500, "Fender", "Stratocaster", "Alder", "Maple");

        //  method 
        guitar.createSound();
    }
}

