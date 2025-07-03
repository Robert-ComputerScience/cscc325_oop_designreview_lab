package com.mycompany.cscc325_oop_designreview_lab;

/**
 * ToDo 7: Create a class for Freshman.
 * This class represents a Freshman, which "is-a" Student.
 *
 * @author Gemini AI
 */
public abstract class Freshman extends Student {

    public Freshman(String name, int age, int credits) {
        // Call the constructor of the parent class, Student.
        super(name, age, credits);
    }

    /**
     * ToDo 10: Add a toString method for the Freshman class.
     * Polymorphism: This method overrides the Student's toString() to add more specific info.
     */
    @Override
    public String toString() {
        return super.toString() + "\nStatus: Freshman";
    }

}