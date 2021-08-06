package day13_scanner;

import java.util.Scanner;

public class ConvertCentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();

        int dollars = cents/100;
        int cents1 = cents%100;
        //System.out.println(cents + " cents equal to: "+ dollars + " dollars and " + cents1 +" cents");
        if(cents>=0) { //if the input is valid
            if (cents1 == 0) {
                System.out.println(dollars + " cents equal to:" + dollars + " dollars");

            } else {
                System.out.println(cents + " cents equal to: " + dollars + " dollars and " + cents1 + " cents");

            }
        }
        else{ // if the input is not valid
            System.out.println("Invalid amount");
        }






    }
}
/*
1. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars

* */
