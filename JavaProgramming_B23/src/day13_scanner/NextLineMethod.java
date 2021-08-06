package day13_scanner;

import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
;
        System.out.println("enter your job title:");
        String jobTitle = scan.nextLine();

        System.out.println("joTitle = " + jobTitle);
    }
}
