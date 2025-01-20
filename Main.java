// Name - Nimit Prakash
// PRN - 23070126082
// Batch - B1
// Main.java

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        int choice = userInput.getOperationChoice(); // Get operation choice from the user
        int[] numbers = userInput.userInput(choice); // Get input based on the user's choice

        if (numbers != null) {
            switch (choice) {
                case 1: // Addition
                    System.out.println("Sum is: " + calculator.addition(numbers));
                    break;
                case 2: // Multiplication
                    System.out.println("Multiplication is: " + calculator.multiplication(numbers));
                    break;
                case 3: // Subtraction
                    System.out.println("Subtraction is: " + calculator.subtraction(numbers));
                    break;
                case 4: // Fibonacci Series
                    int[] fibonacciSeries = calculator.fibonacci(numbers);
                    if (fibonacciSeries != null) {
                        System.out.println("Fibonacci Series is: " + Arrays.toString(fibonacciSeries));
                    }
                    break;
                case 5: // Mean of Array
                    System.out.println("Mean of the array is: " + calculator.mean(numbers));
                    break;
                case 6: // Variance of Array
                    System.out.println("Variance of the array is: " + calculator.variance(numbers));
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid operation.");
            }
        } else {
            System.out.println("No valid input provided.");
        }
    }
}
