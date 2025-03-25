package com.example;

import java.util.Scanner;

/**
 * Improved Java console application.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Ask the user for their name with validation
        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please try again.");
            }
        }

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to the improved Java app.");

        // Simple menu
        int choice = 0;
        while (choice != 3) {
            System.out.println("\nMenu:");
            System.out.println("1. Greet me again");
            System.out.println("2. Perform an addition");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello again, " + name + "!");
                    break;
                case 2:
                    System.out.print("Enter two numbers to add: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println("The sum is: " + (num1 + num2));
                    break;
                case 3:
                    System.out.println("Goodbye, " + name + "!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}