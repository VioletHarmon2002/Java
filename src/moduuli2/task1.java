//Fahrenheit to Celsius Converter
// Write a program that prompts the user to enter a temperature in Fahrenheit
// and converts it to Celsius. Display the converted temperature
// on the console with one decimal place.


package moduuli2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Farenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("The temperature in Celsius is: %.1f\n", celsius);

        scanner.close();
    }
}
