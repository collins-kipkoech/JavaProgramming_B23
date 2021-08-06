package day14_Recap;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        short year = scan.nextShort();

        System.out.println("Enter your month:");
        byte month = scan.nextByte();

        System.out.println("Enter birth day:");
        byte day = scan.nextByte();
        scan.close();

        boolean isValid = (year>0 && year<2021) && (month>1 && month<12) && (day>=1 && day<=31 );
        if(isValid){
            System.out.println(month + "/" + day + "/" + year + " is your birthday");

        }
        else {
            System.out.println("Invalid entry");
        }
    }
}
