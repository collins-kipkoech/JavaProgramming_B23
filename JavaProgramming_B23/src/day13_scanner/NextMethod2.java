package day13_scanner;

import java.util.Scanner;

public class NextMethod2 {
    //disadvantage of nextline method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age  = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);

    }
}
