// UserInput.java

import java.util.*;

class UserInput {
    // Method to get user input for numbers
    int[] userInput(int choice) {
        Scanner scan = new Scanner(System.in);
        int[] numbers;

        if (choice >= 1 && choice <= 3) {
            numbers = new int[2]; // Allocate space for two numbers
            System.out.println("Enter 1st Number:");
            numbers[0] = scan.nextInt();

            System.out.println("Enter 2nd Number:");
            numbers[1] = scan.nextInt();
        } else if (choice == 4) {
            numbers = new int[1]; // Allocate space for one number (for Fibonacci)
            System.out.println("Enter the number for the Fibonacci series:");
            numbers[0] = scan.nextInt();
        } else if (choice == 5 || choice == 6) { // For mean and variance
            System.out.println("Enter the size of the array:");
            int size = scan.nextInt();
            numbers = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scan.nextInt();
            }
        } else {
            System.out.println("Invalid choice! Exiting.");
            numbers = null; // Invalid choice
        }

        return numbers;
    }

    // Method to display a menu and return the user's choice
    int getOperationChoice() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Fibonacci");
        System.out.println("5. Mean of Array");
        System.out.println("6. Variance of Array");
        System.out.print("Enter your choice: ");

        return scan.nextInt(); // Return the user's choice
    }
}
