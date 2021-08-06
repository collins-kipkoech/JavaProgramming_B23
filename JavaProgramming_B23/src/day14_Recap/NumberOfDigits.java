package day14_Recap;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000:");
        int num = scan.nextInt();
        scan.close();
        String result = "";

        if(num>=1 && num<=100000){ // check if the number is valid
            if(num<=9){
                result= "one digit";

            }
            else if(num<=99){
                result = "two digits";
            }
            else if(num<=999){
                result="three digits";
            }
            else if(num<=9999){
                result="four digits";
            }
            else if(num<=99999){
                result="five digits";
            }
            else{
                result="six digits";
            }


        }
        else{
            result = "invalid number";

        }
        System.out.println("result = " + result);

    }
}
/*
Given a number(int) determine and print how many digits it has.
            - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"

            Ex: 124 --> 3 digits
                13213 --> 5 digits
                883218 --> Invalid number
                23 --> 2 digits
                9 --> one digit
                15 --> 2 digits
* */
