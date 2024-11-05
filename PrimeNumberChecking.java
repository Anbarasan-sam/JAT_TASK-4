package guviTask4;

import java.util.Scanner;

public class PrimeNumberChecking {
    public static void main(String[] args) {
        // Initialize scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        
        // Check if input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Call the isPrime method to check if the number is prime
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }

        // Close the scanner
        scanner.close();
    }

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		return false;
	}
}