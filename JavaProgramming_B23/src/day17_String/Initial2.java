package day17_String;

import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String name = scan.nextLine();
        name = name.trim();
        String firstName = name.substring(0,name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ")+1);
        String initials = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
        System.out.println(initials);
    }
}
