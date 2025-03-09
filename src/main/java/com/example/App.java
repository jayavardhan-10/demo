package com.example;

import java.util.Scanner;

/**
 * Simple Java console application.
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to the Java app.");

        // Close the scanner
        scanner.close();
    }
}