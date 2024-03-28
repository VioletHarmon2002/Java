package moduuli4;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many integer numbers in array? ");
        int integerNumber = scanner.nextInt();

        int[] numbers = new int[integerNumber];

        System.out.print("Enter the integers into the array: ");
        for (int i = 0; i < integerNumber; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;


        for (int start = 0; start < numbers.length; start++) {
            int currentSum = 0;
            for (int end = start; end < numbers.length; end++) {
                currentSum += numbers[end];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = start;
                    endIndex = end;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Subarray indices: [" + (startIndex + 1) + ", " + (endIndex + 1) + "]");
    }
}