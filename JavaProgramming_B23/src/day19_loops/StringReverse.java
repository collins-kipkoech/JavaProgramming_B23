package day19_loops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String name = scan.nextLine();
        String reverseName = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            reverseName += name.charAt(i);

        }
        System.out.println("reverseName = " + reverseName);
    }
}
