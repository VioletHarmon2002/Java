//Task 1: A name generator
//
//Write a program that generates random names by combining first
// and last names from hard-coded name arrays. The program should work as follows
//
//Create two arrays, firstNames and lastNames, which contain first and last names.
//
//Ask the user how many random names the program should generate.
//
//Generate random names using the following logic:
//
//Choose the index value for the first name randomly.
//Choose the index value for the last name randomly.
//Use the index values to create a random full name (i.e. first name and last name).
//Print the generated full name.
//Repeat these steps as many times as the user-specified number of names to generate.

package moduuli4;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstName = {"Mary", "Jane", "Kate", "Liisa"};
        String[] lastName = {"Jane", "Parker", "Houston", "Jason"};

        System.out.print("how many random names the program should generate? ");
        int randomNames = scanner.nextInt();

        for (int i = 0; i < randomNames; i++) {
            int randomFirstNameIndex = (int) (Math.random() * firstName.length);
            int randomLastNameIndex = (int) (Math.random() * lastName.length);

            String randomFirstName = firstName[randomFirstNameIndex];
            String randomLastName = lastName[randomLastNameIndex];

            System.out.println("Generated name: " + randomFirstName + " " + randomLastName);
        }

    }


}