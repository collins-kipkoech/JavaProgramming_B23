package day20_loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
       // Scanner scan = ;
        System.out.println("Enter number:");
        int number = new Scanner(System.in).nextInt();
        int result = 1;
        for (int i = number; i >= 1 ; i--) {
            result *=i;

        }
        System.out.println("result = " + result);


    }
}
/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
* */
