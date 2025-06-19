# JavaProblems

✅ Beginner Level (1–20): Focus on Syntax, Control Flow, Data Types
Print “Hello, World” – Basic structure of Java program.

Sum of Two Numbers – Take input and print the sum.

Check Even or Odd – If-else usage.

Find Max of 3 Numbers – Nested if-else.

Check Leap Year – Logical operators.

Simple Calculator – Switch-case.

Print Numbers 1 to N – For loop basics.

Print Multiplication Table – Nested loop.

Reverse a Number – While loop, modulus.

Palindrome Number Check – Logic building.

Factorial Using Loop – Iterative functions.

Fibonacci Series – Sequence generation.

Sum of Digits of a Number

Armstrong Number Check

Print Prime Numbers in a Range

Count Vowels in a String

String Reverse – Using loop & StringBuilder.

Find Duplicate Characters in String

Swap Two Numbers Without Temp Variable

Check for Anagram Strings

🔁 Intermediate Level (21–35): Arrays, Functions, OOP Basics
Linear Search in Array

Binary Search in Array

Sort Array (Bubble/Selection/Insertion)

Find Second Largest Element in Array

Frequency of Elements in Array

Remove Duplicate Elements

Rotate Array by K Steps

Matrix Addition/Subtraction

Transpose a Matrix

Check Matrix Symmetry

Create and Use User-Defined Method

Recursive Factorial

Recursive Fibonacci

Calculate Power (x^n) Using Recursion

GCD and LCM Using Recursion

👨‍🏫 Object-Oriented Programming (36–45): Classes, Inheritance, etc.
Create a Class for Student and Print Details

Constructor Overloading

Method Overloading

Single Inheritance Example

Multilevel Inheritance

Override Parent Class Method

Abstract Class Example

Interface Implementation

Polymorphism in Action (Runtime & Compile-time)

Encapsulation Example with Getters/Setters

🧠 Advanced Basics (46–50): Collections, File I/O, Exception Handling
Read and Write to File (Using FileWriter/FileReader)

Count Words in a File








🧠 Problem 2: Sum of Two Numbers
✅ Problem Statement:
Write a Java program that takes two integers as input from the user and prints their sum.

🎯 Concepts Covered:
Reading input using Scanner

Performing arithmetic operations

Basic int data type usage

✅ Solution:
java
Copy
Edit
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
📝 Explanation:
Scanner sc = new Scanner(System.in); – Creates a Scanner object to read user input.

sc.nextInt() – Reads an integer from the console.

int sum = a + b; – Adds the two numbers.

System.out.println("Sum: " + sum); – Displays the result.

✅ Ready for Problem 3: Check Even or Odd? Let me know to continue.








You said:
Problem 3


ChatGPT said:
Great! Let's move on.

🧠 Problem 3: Check Even or Odd
✅ Problem Statement:
Write a Java program to check whether a given number is even or odd.

🎯 Concepts Covered:
Conditional logic (if-else)

Modulo operator (%)

Input using Scanner

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read input

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        sc.close(); // Close Scanner
    }
}
📝 Explanation:
% is the modulo operator, which gives the remainder.

If number % 2 == 0, the number is evenly divisible by 2 → it's Even.

Otherwise, it's Odd.

✅ Ready for Problem 4: Find the Maximum of 3 Numbers?

Perfect! Here's the next one.

🧠 Problem 4: Find the Maximum of 3 Numbers
✅ Problem Statement:
Write a Java program to find the largest of three numbers entered by the user.

🎯 Concepts Covered:
Multiple if-else statements

Logical operators (>)

User input with Scanner

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The maximum number is: " + max);

        sc.close();
    }
}
📝 Explanation:
The program compares each pair of numbers using >= to make sure it works even if two numbers are equal.

Stores the maximum in a variable max and prints it.

✅ Ready for Problem 5: Check Leap Year?








You said:
Problem 5,6,7,8,9,10


ChatGPT said:
Perfect! Let's go through Problems 5 to 10 together. These build your confidence with conditionals and loops. 🚀

🧠 Problem 5: Check Leap Year
✅ Problem Statement:
Check if a given year is a leap year.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

        sc.close();
    }
}
🧠 Problem 6: Simple Calculator
✅ Problem Statement:
Perform +, -, *, or / operations based on user input.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': 
                if (b != 0) System.out.println("Result: " + (a / b));
                else System.out.println("Cannot divide by zero");
                break;
            default: System.out.println("Invalid operator");
        }

        sc.close();
    }
}
🧠 Problem 7: Print Numbers 1 to N
✅ Problem Statement:
Take input N and print numbers from 1 to N using a loop.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class PrintOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
🧠 Problem 8: Print Multiplication Table
✅ Problem Statement:
Print the multiplication table of a given number up to 10.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
🧠 Problem 9: Reverse a Number
✅ Problem Statement:
Reverse the digits of an integer (e.g., 123 → 321).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
🧠 Problem 10: Palindrome Number Check
✅ Problem Statement:
Check if a number is a palindrome (e.g., 121, 1331).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int original = sc.nextInt();
        int num = original;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }

        sc.close();
    }
}
✅ Let me know when you’re ready for Problems 11 to 15!








You said:
Problem 11 to 20


ChatGPT said:
Excellent! Let's dive into Problems 11 to 20. These focus on loops, math logic, strings, and conditionals — key topics for core Java mastery.

🧠 Problem 11: Factorial Using Loop
✅ Problem Statement:
Calculate the factorial of a number using a loop (e.g., 5! = 5×4×3×2×1 = 120).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
🧠 Problem 12: Fibonacci Series
✅ Problem Statement:
Print the first N numbers in the Fibonacci series.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        sc.close();
    }
}
🧠 Problem 13: Sum of Digits of a Number
✅ Problem Statement:
Calculate the sum of digits of a number (e.g., 123 → 6).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
🧠 Problem 14: Armstrong Number Check
✅ Problem Statement:
Check if a number is an Armstrong number (e.g., 153 → 1³ + 5³ + 3³ = 153).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int original = sc.nextInt();
        int num = original, sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
🧠 Problem 15: Print Prime Numbers in a Range
✅ Problem Statement:
Print all prime numbers from 1 to N.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
🧠 Problem 16: Count Vowels in a String
✅ Problem Statement:
Count the number of vowels in a string (a, e, i, o, u).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
        sc.close();
    }
}
🧠 Problem 17: Reverse a String
✅ Problem Statement:
Reverse a given string (e.g., hello → olleh).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
🧠 Problem 18: Find Duplicate Characters in String
✅ Problem Statement:
Find and print duplicate characters from a string.

✅ Solution:
java
Copy
Edit
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }

        sc.close();
    }
}
🧠 Problem 19: Swap Two Numbers Without Temp Variable
✅ Problem Statement:
Swap two integers without using a third variable.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
        sc.close();
    }
}
🧠 Problem 20: Check for Anagram Strings
✅ Problem Statement:
Check if two strings are anagrams (e.g., "listen" and "silent").

✅ Solution:
java
Copy
Edit
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        } else {
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean result = Arrays.equals(a, b);
            System.out.println(result ? "Anagrams" : "Not Anagrams");
        }

        sc.close();
    }
}
✅ Let me know when you're ready for Problems 21 to 30, where we’ll get into arrays and recursion!

You're doing great! Now let's level up to Problems 21 to 30 — focusing on arrays, sorting, matrix operations, and a bit of recursion. These are essential for cracking real coding interviews too. 🚀

🧠 Problem 21: Linear Search in Array
✅ Problem Statement:
Search for an element in an array using linear search.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 12, 7, 9, 1};
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Not found");
        sc.close();
    }
}
🧠 Problem 22: Binary Search in Array
✅ Problem Statement:
Search for an element using binary search (array must be sorted).

✅ Solution:
java
Copy
Edit
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int left = 0, right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                System.out.println("Found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) System.out.println("Not found");
        sc.close();
    }
}
🧠 Problem 23: Sort Array (Bubble Sort)
✅ Problem Statement:
Sort an array using bubble sort.

✅ Solution:
java
Copy
Edit
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
🧠 Problem 24: Find Second Largest Element in Array
✅ Problem Statement:
Find the second largest number in an array.

✅ Solution:
java
Copy
Edit
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }

        System.out.println("Second largest: " + second);
    }
}
🧠 Problem 25: Frequency of Elements in Array
✅ Problem Statement:
Count frequency of each element in an array.

✅ Solution:
java
Copy
Edit
import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key + " → " + freq.get(key) + " times");
        }
    }
}
🧠 Problem 26: Remove Duplicate Elements in Array
✅ Problem Statement:
Remove duplicate elements from an array.

✅ Solution:
java
Copy
Edit
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 5};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array without duplicates: " + set);
    }
}
🧠 Problem 27: Rotate Array by K Steps
✅ Problem Statement:
Rotate the elements of an array to the right by K positions.

✅ Solution:
java
Copy
Edit
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Rotated array: " + Arrays.toString(rotated));
    }
}
🧠 Problem 28: Matrix Addition
✅ Problem Statement:
Add two matrices of same size.

✅ Solution:
java
Copy
Edit
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for (int[] row : sum) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
🧠 Problem 29: Transpose a Matrix
✅ Problem Statement:
Transpose a 2D matrix.

✅ Solution:
java
Copy
Edit
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] transpose = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed matrix:");
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
🧠 Problem 30: Check Matrix Symmetry
✅ Problem Statement:
Check if a matrix is symmetric (i.e., A[i][j] == A[j][i]).

✅ Solution:
java
Copy
Edit
public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {2, 1}};
        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        System.out.println(symmetric ? "Matrix is symmetric" : "Matrix is not symmetric");
    }
}
✅ You're doing awesome! Let me know when you're ready for Problems 31–40, where we enter the world of methods and object-oriented programming (OOP)!

Great! You're entering the Object-Oriented Programming (OOP) zone now — the real core of Java. 🧱 Problems 31–40 will solidify your understanding of methods, recursion, classes, inheritance, and more.

🧠 Problem 31: Create and Use User-Defined Method
✅ Problem Statement:
Write a method that adds two numbers and returns the result.

✅ Solution:
java
Copy
Edit
public class MethodAddition {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);
    }
}
🧠 Problem 32: Recursive Factorial
✅ Problem Statement:
Calculate factorial using recursion.

✅ Solution:
java
Copy
Edit
public class RecursiveFactorial {
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + ": " + factorial(num));
    }
}
🧠 Problem 33: Recursive Fibonacci
✅ Problem Statement:
Print Fibonacci numbers using recursion.

✅ Solution:
java
Copy
Edit
public class RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
🧠 Problem 34: Calculate Power (xⁿ) Using Recursion
✅ Problem Statement:
Calculate x raised to the power n using recursion.

✅ Solution:
java
Copy
Edit
public class PowerRecursion {
    static int power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("2^5 = " + power(2, 5));
    }
}
🧠 Problem 35: GCD and LCM Using Recursion
✅ Problem Statement:
Find GCD using recursion. Use GCD to compute LCM.

✅ Solution:
java
Copy
Edit
public class GCDLCM {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}
🧠 Problem 36: Create a Class for Student and Print Details
✅ Problem Statement:
Create a Student class with name and marks. Print details using object.

✅ Solution:
java
Copy
Edit
public class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.marks = 85;
        s.display();
    }
}
🧠 Problem 37: Constructor Overloading
✅ Problem Statement:
Use multiple constructors with different parameters.

✅ Solution:
java
Copy
Edit
public class Box {
    int length, width;

    Box() {
        length = width = 1;
    }

    Box(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5, 4);
        b1.area();
        b2.area();
    }
}
🧠 Problem 38: Method Overloading
✅ Problem Statement:
Use same method name with different parameters.

✅ Solution:
java
Copy
Edit
public class OverloadExample {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        System.out.println("Sum int: " + obj.add(5, 10));
        System.out.println("Sum double: " + obj.add(5.5, 2.5));
    }
}
🧠 Problem 39: Single Inheritance Example
✅ Problem Statement:
Demonstrate inheritance with a Person and Student class.

✅ Solution:
java
Copy
Edit
class Person {
    void greet() {
        System.out.println("Hello, I am a person");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.greet();
        s.study();
    }
}
🧠 Problem 40: Multilevel Inheritance
✅ Problem Statement:
Demonstrate multilevel inheritance.

✅ Solution:
java
Copy
Edit
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
✅ Let me know when you’re ready for the final Problems 41 to 50, where we cover polymorphism, abstraction, interfaces, collections, and file I/O — super important for real-world projects and job interviews!

Awesome! You're now at the final stretch — Problems 41 to 50 — where you'll learn about polymorphism, interfaces, abstraction, collections, and file handling. These are key to writing clean, scalable, and interview-ready Java code. 🚀

🧠 Problem 41: Method Overriding (Runtime Polymorphism)
✅ Problem Statement:
Demonstrate method overriding using inheritance.

✅ Solution:
java
Copy
Edit
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal a = new Dog();  // Polymorphism
        a.sound(); // Calls Dog's sound()
    }
}
🧠 Problem 42: Abstract Class Example
✅ Problem Statement:
Use an abstract class and implement it.

✅ Solution:
java
Copy
Edit
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = πr²");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
🧠 Problem 43: Interface Implementation
✅ Problem Statement:
Create an interface and implement it in a class.

✅ Solution:
java
Copy
Edit
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
🧠 Problem 44: Use ArrayList to Store and Print Elements
✅ Problem Statement:
Add 5 elements to an ArrayList and print them.

✅ Solution:
java
Copy
Edit
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Kotlin");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
🧠 Problem 45: Sort ArrayList of Integers
✅ Problem Statement:
Sort an ArrayList<Integer> in ascending order.

✅ Solution:
java
Copy
Edit
import java.util.*;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 3, 2, 4));
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
🧠 Problem 46: HashMap – Store and Retrieve Key-Value Pairs
✅ Problem Statement:
Use a HashMap to store and retrieve student names and marks.

✅ Solution:
java
Copy
Edit
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Alice", 90);
        students.put("Bob", 85);
        students.put("Charlie", 95);

        for (String name : students.keySet()) {
            System.out.println(name + " scored " + students.get(name));
        }
    }
}
🧠 Problem 47: Read from a File
✅ Problem Statement:
Read content from a text file using Java.

✅ Solution:
java
Copy
Edit
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
🧠 Problem 48: Write to a File
✅ Problem Statement:
Write text to a file using Java.

✅ Solution:
java
Copy
Edit
import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello from Java file writing!");
            writer.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
🧠 Problem 49: Exception Handling Example
✅ Problem Statement:
Handle division by zero using try-catch.

✅ Solution:
java
Copy
Edit
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
🧠 Problem 50: Create and Use a Custom Class with Constructor
✅ Problem Statement:
Create a custom Employee class with constructor and display method.

✅ Solution:
java
Copy
Edit
class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    public static void main(String[] args) {
        Employee e = new Employee("John Doe", 101);
        e.display();
    }
}
🎉 Congratulations! You’ve just gone through 50 carefully selected Java problems to take you from Beginner → Intermediate.

Would you like:

A PDF with all 50 problems and solutions again?

A practice sheet with only problem statements?

Or help creating a project to apply these concepts?

Let me know what you'd like to do next!








You said:
I want more problems to solve so that it will make strong base in java


ChatGPT said:
Update memory? “Wants to strengthen their Java foundation by solvi...”

Yes

No
That's a great mindset! Here's a curated next batch of 30 advanced beginner to intermediate Java problems to solidify your concepts in:

Strings

Arrays

Recursion

OOP

Collections

Algorithms

🔡 String Problems
Count number of words in a string

Remove all white spaces from a string

Check if two strings are rotations of each other

Find the first non-repeating character in a string

Convert string to title case

Check if a string contains only digits

Compress a string like aaabb → a3b2

🔢 Array and Math Problems
Find common elements between two arrays

Rearrange array in alternating positive & negative items

Find the missing number in a given range

Kadane's Algorithm (Max sum subarray)

Find the majority element in an array

Move all zeros to the end

Find peak element in array

Check if array is sorted and rotated

🔁 Loop & Recursion Challenges
Convert decimal to binary using recursion

Generate all subsets of a set using recursion

Count ways to climb stairs (fibonacci variation)

Print all permutations of a string

Find nth Fibonacci number using memoization

👨‍💻 OOP / Class-based Challenges
Create a BankAccount class with deposit, withdraw, balance methods

Create a Library class with book lending system

Implement a basic Calculator using method overloading

Design a Vehicle interface with Car and Bike implementations

Use this and super keywords in a meaningful example

🗃️ Collections Framework
Sort a List of custom Employee objects by salary

Create a HashMap to count word frequency from a paragraph

Store and print data using HashSet (no duplicates)

Create a PriorityQueue for a task scheduler

Implement a basic address book using Map<String, List<String>>

Would you like:

Full solutions with explanations one-by-one (like before)?

A downloadable practice workbook (PDF or DOC)?

A real-world mini-project using these topics?

Let me know how you'd like to continue!

Perfect! We'll go through all 30 problems with full Java code and explanations, just like before. Let’s begin with the first batch.

🔡 String Problems
✅ Problem 1: Count Number of Words in a String
🧠 Problem:
Count how many words are present in a sentence (words are separated by spaces).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = input.split("\\s+");
            System.out.println("Word count: " + words.length);
        }

        sc.close();
    }
}
📘 Explanation:
trim() removes leading/trailing spaces.

split("\\s+") splits by one or more spaces.

✅ Problem 2: Remove All Whitespaces from a String
🧠 Problem:
Remove all space characters from a string.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String result = str.replaceAll("\\s", "");
        System.out.println("Without spaces: " + result);

        sc.close();
    }
}
📘 Explanation:
replaceAll("\\s", "") removes all whitespace characters (space, tab, etc).

✅ Problem 3: Check if Two Strings Are Rotations
🧠 Problem:
Check if str2 is a rotation of str1 (e.g., ABCD and CDAB → true).

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("Strings are rotations.");
        } else {
            System.out.println("Strings are not rotations.");
        }

        sc.close();
    }
}
📘 Explanation:
Concatenate str1 to itself → all its rotations will be a substring of it.

Check if str2 exists in it.

✅ Problem 4: First Non-Repeating Character
🧠 Problem:
Find and print the first character in the string that doesn't repeat.

✅ Solution:
java
Copy
Edit
import java.util.*;

public class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                return;
            }
        }

        System.out.println("No unique characters.");
        sc.close();
    }
}
📘 Explanation:
LinkedHashMap keeps insertion order.

First key with value 1 is your answer.

✅ Problem 5: Convert String to Title Case
🧠 Problem:
Convert "hello world" → "Hello World"

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");

        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0)
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
        }

        System.out.println("Title Case: " + titleCase.toString().trim());
        sc.close();
    }
}
📘 Explanation:
Capitalizes first letter, makes others lowercase.

✅ Problem 6: Check if String Contains Only Digits
🧠 Problem:
Check if the input string has only numbers.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class DigitOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isNumeric = str.matches("\\d+");
        System.out.println("Only digits? " + isNumeric);

        sc.close();
    }
}
📘 Explanation:
\\d+ matches one or more digits.

✅ Problem 7: String Compression (aaabb → a3b2)
🧠 Problem:
Compress repeating characters to count form.

✅ Solution:
java
Copy
Edit
import java.util.Scanner;

public class StringCompressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println("Compressed: " + sb);
        sc.close();
    }
}
📘 Explanation:
Use StringBuilder to append char + count while iterating.

Let’s continue with Array and Math Problems (8–15) next.

Would you like me to continue right away with the next set of problems or send everything in a downloadable file at once later too?

ArrayList Operations (add, remove, contains)

HashMap Example (Storing Student Roll & Marks)

Try-Catch-Finally with Multiple Exceptions
