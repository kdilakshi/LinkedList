/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclass;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author USER
 */
public class Question11 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // Add fruits to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Original List: " + fruits);

        // Remove the 3rd element using an Iterator
        Iterator<String> iterator = fruits.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
            if (count == 3) { // Remove the 3rd element
                iterator.remove();
                break;
            }
        }

        System.out.println("List after removing 3rd element: " + fruits);
    }
}
