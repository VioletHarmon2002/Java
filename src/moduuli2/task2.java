//Write a program that asks the user for the lengths of the legs of
// a right triangle and prints the length of the hypotenuse of the triangle.

package moduuli2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first leg: ");
        double leg1 = scanner.nextDouble();

        System.out.print("Enter the length of the second leg: ");
        double leg2 = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        System.out.printf("The length of the hypotenuse is: %.2f\n", hypotenuse);

        scanner.close();
    }


}
