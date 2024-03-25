//Leiviskä, naula and luoti are medieval Finnish units of measurement.
//
//One leiviskä is 20 naula.
//One naula is 32 luoti.
//One luoti is 13.28 grams.
//Write a program that asks the user for a weight in grams and converts it
// to medieval measurements: leiviskä, naula, and luoti.


package moduuli2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g) : ");
        double weightG = scanner.nextDouble();

        final int NAULA_PER_LEIVISKA = 20;
        final int LUOTI_PER_NAULA = 32;
        final double GRAMS_PER_LUOTI = 13.28;

        int leiviska = (int) (weightG / (NAULA_PER_LEIVISKA * LUOTI_PER_NAULA * GRAMS_PER_LUOTI));
        int remainingW = (int) (weightG % (NAULA_PER_LEIVISKA * LUOTI_PER_NAULA * GRAMS_PER_LUOTI));
        int naula = remainingW / (LUOTI_PER_NAULA * (int)GRAMS_PER_LUOTI);
        double luoti = (remainingW % (LUOTI_PER_NAULA * (int)GRAMS_PER_LUOTI)) / GRAMS_PER_LUOTI;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.\n", weightG, leiviska, naula, luoti);

        scanner.close();
    }



}
