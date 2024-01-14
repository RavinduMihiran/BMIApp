
package com.mycompany.bmiapp;

/**
 *
 * @author Mihiran
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    private ArrayList<Bmi> bmiList;
    private int lastId;

    public Tester() {
        this.bmiList = new ArrayList<>();
        this.lastId = 0;
    }

    
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.displayMenu();
    }

    // Display menu options
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create a record");
            System.out.println("2. Show BMI data for all users");
            System.out.println("3. Show BMI data for a selected user");
            System.out.println("4. Delete all records");
            System.out.println("5. Exit application");

            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    create();
                    break;
                case "2":
                    index();
                    break;
                case "3":
                    System.out.print("Enter user ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    view(id);
                    break;
                case "4":
                    delete();
                    break;
                case "5":
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (!choice.equals("5"));

        scanner.close();
    }

    // Display records
    public void index() {
        for (Bmi bmi : bmiList) {
            bmi.display();
        }
    }

    // Display a record for the given ID
    public void view(int id) {
        for (Bmi bmi : bmiList) {
            if (bmi.getId() == id) {
                bmi.display();
                return;
            }
        }
        System.out.println("User with ID " + id + " not found.");
    }

    // Create a new record
    public void create() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter year of birth: ");
        int yob = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter height (in inches): ");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter weight (in pounds): ");
        int weight = Integer.parseInt(scanner.nextLine());

        Bmi newBmi = new Bmi(id, name, yob, height, weight);
        bmiList.add(newBmi);

        System.out.println("Record created successfully.");
    }

    // Delete records
    public void delete() {
        bmiList.clear();
        System.out.println("All records deleted.");
    }

    // Exit the application
    public void exit() {
        System.out.println("Exiting application. Goodbye!");
        System.exit(0);
    }
}
