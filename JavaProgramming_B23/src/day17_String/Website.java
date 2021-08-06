package day17_String;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter website:");
        String website = scan.nextLine();

        boolean startsWith = website.startsWith("www.");
        boolean endsWith = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");

        if(startsWith && endsWith){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
