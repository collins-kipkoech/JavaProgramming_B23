package day20_loops;

import java.util.Scanner;

public class FactorialPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int factorial = 1;
        //5*4*3*2*1

        for (int i = num; i > 0 ; i--) {
            factorial *= i;


        }
        System.out.println("factorial = " + factorial);
    }
}
