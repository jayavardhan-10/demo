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

        
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}