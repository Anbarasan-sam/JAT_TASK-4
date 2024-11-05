package guviTask4;

import java.util.Scanner;

public class SeniorCitizenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

      
        if (age >= 65) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }

        scanner.close();
    }
}
