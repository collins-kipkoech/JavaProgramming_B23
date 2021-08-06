package day13_scanner;

import java.util.Scanner;

public class NextMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your firstname:");
        String firstName = scan.next();
        // only takes first word, gender,color,yes/no
        System.out.println("Enter your second name:");
        String secondName = scan.next();
        String fullName = firstName + " " + secondName;
        System.out.println("fullName = " + fullName);

        System.out.println("Enter your address:");

    }
}
