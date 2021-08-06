package day12_scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your hourly rate: ");
        double hourlyRate = input.nextDouble();
        System.out.println("How many hours do you work: ");
        int hours = input.nextInt();
        System.out.println("How many weeks do you work: ");
        int weeks = input.nextInt();

        double salary = hourlyRate*hours*weeks;
        System.out.println("you are making $" + hourlyRate + " per hour");
        System.out.println("you are working $" + weeks + " in a year");
        System.out.println("You salary is $" + salary + " per year");
    }
}
