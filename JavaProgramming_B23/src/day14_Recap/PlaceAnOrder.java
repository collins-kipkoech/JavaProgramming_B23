package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your product name:");
        String productName = scan.nextLine();

        System.out.println("Enter the price:");
        double price = scan.nextDouble();

        System.out.println("Enter the quanity:");
        int quantity = scan.nextInt();

        double totalPrice = quantity*price;

        System.out.println("Enter your first name:");
        String firstName = scan.next();
        scan.close();// close the scanner

        System.out.println(firstName +", your order for " + quantity+  " Apples has been places. Your total is $" + totalPrice +".");



    }
}
/*
   1. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
* */