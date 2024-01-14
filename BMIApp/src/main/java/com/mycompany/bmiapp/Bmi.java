package com.mycompany.bmiapp;

/**
 *
 * @author Mihiran
 */

public class Bmi {
    private int id;
    private String name;
    private int yob;
    private int height;
    private int weight;

    // Constructor
    public Bmi(int id, String name, int yob, int height, int weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = height;
        this.weight = weight;
    }

    // Setters and Getters

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    // Calculate BMI
    public double calculate() {
        return (double) weight / ((double) height * height);
    }

    // Display BMI details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yob);
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("BMI: " + calculate());
        System.out.println("------------------------");
    }
}


