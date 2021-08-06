package day13_scanner;

import java.util.Scanner;

public class FreeShipping {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the item:");
        double price = scan.nextDouble();
        System.out.println("Are you a prime member:");
        boolean isPrime = scan.nextBoolean();

        double totalCost = (isPrime)? price : price + 3.99;
        System.out.println("totalCost = " + totalCost);

    }
}

/*
freeshipping:
    price
    isPrime:
        true: free shipping
        false: 3.99 shipping fee
* */