package day23_arrays;

import java.util.Scanner;

public class AverageNumberPractice1 {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter:");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[scan.nextInt()];
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number:");
            numbers[i]= scan.nextInt();
            sum+=numbers[i];

        }
        System.out.println("sum = " + sum);
        double average=(double)sum/ numbers.length;
        System.out.println("average = " + average);
    }
}
