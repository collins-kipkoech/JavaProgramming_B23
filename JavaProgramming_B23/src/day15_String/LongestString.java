package day15_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string:");
        String firstString = scan.nextLine();

        System.out.println("Enter second string:");
        String secondString = scan.nextLine();

        if(firstString.length()>secondString.length()){
            System.out.println(firstString + " is longer");
        }
        else if(firstString.length()==secondString.length()){
            System.out.println("Equal");
        }
        else{
            System.out.println(secondString + " is longer");
        }
    }
}
