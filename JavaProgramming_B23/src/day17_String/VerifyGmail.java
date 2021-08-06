package day17_String;

import java.util.Scanner;

public class VerifyGmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gmail address:");
        String gmail = scan.nextLine();
        String message = "";

        boolean isValid = gmail.endsWith("@gmail.com");
        if(isValid){
            message = "Valid";

        }
        else{
            message = "Invalid";
        }
        System.out.println("message = " + message);
        scan.close();
    }
}

/*
   1. write a program to verify if the gmail is valid
            requirments:
                    a valid gmail account should end with @gmail.com
* */