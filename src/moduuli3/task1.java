//Write a program that prompts the user to enter the coefficients
// of a quadratic equation (ax^2 + bx + c = 0) and calculates
// its roots using the quadratic formula. Display the roots on the console.
// If the equation has no real roots, display the message "No real roots".

package moduuli3;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients  (ax^2 + bx + c = 0):");

        System.out.print("Enter  a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots");
        }

        scanner.close();
    }
}






