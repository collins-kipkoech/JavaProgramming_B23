package day12_scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println((num%2==0)? "odd" : "even");
        System.out.println((num>0)? "positive" :(num<0)? "negative" : "zero");
    }
}
