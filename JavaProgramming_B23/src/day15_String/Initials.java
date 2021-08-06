package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scan.next();

        System.out.println("Enter second name:");
        String lastName = scan.next();
        scan.close();

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("initials = " + initials);
    }
}
