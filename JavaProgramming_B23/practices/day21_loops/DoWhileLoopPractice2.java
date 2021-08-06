package day21_loops;

import java.util.Scanner;

public class DoWhileLoopPractice2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String username="cybertek";
        String password = "1234";




            System.out.println("Enter username:");
            String u= scan.next();
            System.out.println("Enter password:");
            String p = scan.next();

        while (!(u.equals(username) && p.equals(password))){
            System.out.println("login again");

        };



    }

}
//Write a program that asks user to enter his/her username and password until user enters
//correctly.
