package day22_Recap;

import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        int i = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        do {
            if (i%2==0){
                sumOfEven+=i;
            }
            else{
                sumOfOdd+=i;

            }
            i++;

        }while(i<=10);
        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);

        System.out.println("--------------------------------------------");

        Scanner scan = new Scanner(System.in);
        String username = "cybertek";
        String password = "cybertek1234";
        String u = "";
        String p = "";
        do {
            System.out.println("Enter username:");
            u = scan.next();

            System.out.println("Enter password:");
            p = scan.next();
        }while (!(u.equals(username) && p.equals(password)));
        System.out.println("Logged In");
    }
}
