import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter first number: ");
        int a = sc.nextInt(); // Read first integer

        System.out.print("Enter second number: ");
        int b = sc.nextInt(); // Read second integer

        int sum = a + b; // Add the two numbers
        System.out.println("Sum: " + sum); // Output the result

        sc.close(); // Close the Scanner to free resources
    }
}