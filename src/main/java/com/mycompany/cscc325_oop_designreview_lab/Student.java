/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cscc325_oop_designreview_lab;

/**
 * ToDo 4: Added comments.
 * Represents a student, which is a specialized type of Human.
 *
 * @author MoaathAlrajab (and Gemini AI)
 */
// ToDo 1: Make this class a child of Human.
public abstract class Student extends Human {
    private int credits;
    // ToDo 3: Add a field for GPA and create a setter and a getter.
    private double gpa;

    /**
     * ToDo 2 & 6: Fix the constructor.
     * It now calls the parent 'Human' constructor using super() and initializes its own fields.
     */
    public Student(String name, int age, int credits) {
        super(name, (short) age); // Call the constructor of the Human class.
        this.credits = credits;
    }

    // --- Getter and Setter for GPA (Encapsulation) ---
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    /**
     * ToDo 9: Add a toString method for the Student class.
     * This method is overridden to provide a custom string representation.
     */
    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %d\nCredits: %d\nGPA: %.2f",
                getName(), getAge(), this.credits, this.gpa);
    }
}