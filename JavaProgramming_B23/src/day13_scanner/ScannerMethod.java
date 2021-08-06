package day13_scanner;

import java.util.Scanner;

public class ScannerMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are a fulltime employee");
        boolean isFullTime = scan.nextBoolean();
        System.out.println("You are an adult");
        boolean isAdult = scan.nextBoolean();

        System.out.println("You are married");
        boolean isMarried = scan.nextBoolean();

        System.out.println("you are married "+ isMarried);
        System.out.println("you are an adult " + isAdult);
        System.out.println("You are fulltime employee " + isFullTime);
    }
}
