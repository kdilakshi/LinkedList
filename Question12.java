/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclass;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Question12 {
     public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        checkFruit(fruits, "Mango");
        checkFruit(fruits, "Pineapple");
    }

    public static void checkFruit(ArrayList<String> fruits, String fruitName) {
        if (fruits.contains(fruitName)) {
            System.out.println("Fruit found: " + fruitName);
        } else {
            System.out.println("Fruit not found: " + fruitName);
        }
    }

}
