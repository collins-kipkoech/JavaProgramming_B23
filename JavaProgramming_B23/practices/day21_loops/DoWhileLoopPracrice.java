package day21_loops;

import java.util.Scanner;

public class DoWhileLoopPracrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username = "cybertek";
        String password = "cybertek123";
        String u ="";
        String p = "";
        int attemps = 0;

        while (!(u.equals(username)&& p.equals(password))){
            System.out.println("Enter username:");
            u = scan.next();
            System.out.println("Enter password:");
            p=scan.next();

            attemps++;

            if(attemps==3){
                System.out.println("Account locked");
                System.exit(0);
            }


        }
        System.out.println("Logged in");
        System.out.println("Your username is: "+u);


    }
}
