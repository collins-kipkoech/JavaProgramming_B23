package day19_loops;

import java.util.Scanner;

public class SumOfNumbersPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Enter num:");
            int num = scan.nextInt();
            result += num;


        }
        System.out.println("result = " + result);
    }
}
