//Write a program that prompts the user to enter two positive integers,
// start and end (where start < end).
// The program should generate and display all the prime numbers between start and end, inclusive.
//
//A prime number is a positive integer greater than 1 that has no positive divisors other
// than 1 and itself.
//
//Your program should use control structures
// (such as loops and conditional statements) to implement the logic for generating
// and checking prime numbers.
package moduuli3;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two positive integers where start < end):");
        int start = scanner.nextInt();
        int end = scanner.nextInt();


        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

