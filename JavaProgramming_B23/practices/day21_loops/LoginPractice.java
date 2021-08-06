package day21_loops;

import java.util.Scanner;

public class LoginPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "collins";
        String password = "colo123";

        String u = "";
        String p = "";

        do {
            System.out.println("Enter username:");
            u = scan.next();
            System.out.println("Enter password:");
            p=scan.next();
        }while (!(u.equals(username) && p.equals(password)));
        System.out.println("Logged In Successfully");
    }
}
