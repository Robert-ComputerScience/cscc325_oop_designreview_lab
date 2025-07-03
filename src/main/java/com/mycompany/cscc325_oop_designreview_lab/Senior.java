package com.mycompany.cscc325_oop_designreview_lab;

/**
 * ToDo 7: Create a class for Senior.
 * This class represents a Senior, which "is-a" Student.
 *
 * @author Gemini AI
 */
public abstract class Senior extends Student {

    /**
     * Constructor for the Senior class.
     * ToDo 8: The senior class should have a minimum of 85 credits.
     * This rule is enforced here, demonstrating encapsulation of business logic.
     */
    public Senior(String name, int age, int credits) {
        if (credits < 85) {
            throw new IllegalArgumentException("A senior must have at least 85 credits.");
        }
        super(name, age, credits);
    }

    /**
     * ToDo 11: Add a toString method for the Senior class.
     * Polymorphism: Overrides the parent toString() method.
     */
    @Override
    public String toString() {
        return super.toString() + "\nStatus: Senior";
    }
}