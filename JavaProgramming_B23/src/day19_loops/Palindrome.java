package day19_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);
            
        }
        boolean isPalindrome = word.equals(reverse);
        System.out.println("is palindrome: "+ isPalindrome);

        }
    }

