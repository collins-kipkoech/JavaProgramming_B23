package day19_loops;

import java.util.Scanner;

public class Palindrome_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.next();
        String reverse = "";

        //int for loop, statement 1 represents the number of characters in the word
        //statement 2 represents the index of the first character in the word
        //statement 3 decrements the word starting from highest index to the lowest
        //i=3 i>=0 i--

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);

        }
        boolean isPalindrome = reverse.equals(word);
        System.out.println("reverse = " + reverse);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
