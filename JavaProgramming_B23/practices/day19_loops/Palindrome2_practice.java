package day19_loops;

import java.util.Scanner;

public class Palindrome2_practice {
    public static void main(String[] args) {

        System.out.println("Enter word:");
        String word = new Scanner(System.in).next(); // anna
        String reverse = "";

        for (int i = word.length()-1;i>=0;i--) {
            reverse += word.charAt(i);


        }
        System.out.println("reverse = " + reverse);
    }
}
