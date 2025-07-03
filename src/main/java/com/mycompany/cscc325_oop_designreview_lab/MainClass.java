/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cscc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * Main driver class for the application.
 *
 * @author MoaathAlrajab (and Gemini AI)
 */
public class MainClass {

    public static void main(String[] args) {
        // ToDo 5: Fix the error by instantiating the correct subclass objects.
        Freshman std1 = new Freshman("James", 20, 12) {
            @Override
            public String getAddress() {
                return "";
            }

            @Override
            public void setAddress(String address) {

            }
        }; // name, age, credits
        Senior std2 = new Senior("John", 30, 90) {
            @Override
            public String getAddress() {
                return "";
            }

            @Override
            public void setAddress(String address) {

            }
        };

        // ToDo 12: Set GPA using user input.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter GPA for " + std1.getName() + ": ");
        std1.setGpa(scanner.nextDouble()); // Using the public setter (Encapsulation).

        System.out.print("Enter GPA for " + std2.getName() + ": ");
        std2.setGpa(scanner.nextDouble()); // Using the public setter (Encapsulation).

        System.out.println("\n-------------------------------------");

        // Polymorphism: The correct toString() is called for each object.
        System.out.println(std1);
        System.out.println("-------------------------------------");
        System.out.println(std2);

        scanner.close();
    }
}

/*
 * ToDo 13: Comments explaining the code.
 *
 * --- OOP Principles Demonstrated ---
 *
 * 1. INHERITANCE:
 * - `Student` inherits from `Human`.
 * - `Freshman` and `Senior` inherit from `Student`.
 * - This creates a logical hierarchy and promotes code reuse.
 *
 * 2. ENCAPSULATION:
 * - All data fields (`name`, `age`, `gpa`, etc.) are `private`.
 * - Access is controlled through public methods (getters/setters).
 * - The `Senior` class encapsulates a business rule (minimum 85 credits).
 *
 * 3. POLYMORPHISM:
 * - The `toString()` method is defined in `Student` and overridden in `Freshman` and `Senior`.
 * - When `System.out.println()` is called on an object, the JVM executes the most
 * specific version of `toString()` for that object's type at runtime.
 */