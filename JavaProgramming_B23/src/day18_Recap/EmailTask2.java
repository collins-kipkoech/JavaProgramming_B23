package day18_Recap;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        //String email = "collins_kipkoech@gmail.com";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.nextLine();
        

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        String firstName = email.substring(0,indexOf_);
        String lastName = email.substring(indexOf_ +1,indexOfAt);
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String domain = email.substring(indexOfAt+1,email.indexOf("."));

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);


    }
}
/*
EmailTask2:
        Assume that email address is constructed by person's first name and followed by an underscore
        and last name.
        Write a program that will print out information about user based on email. Print first name,
        last name, and domain.
           First and Last name should be printed with proper format - uppercase first letter and
           remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
* */
