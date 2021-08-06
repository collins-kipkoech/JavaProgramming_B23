package day19_loops;

import java.util.Scanner;

public class MaximumNumberPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter number:");
            int n = scan.nextInt();

            if(n>max){
                max = n;
            }
//            if(i==3){
//                System.out.println(max);
//            }

        }
        System.out.println("max = " + max);
    }
}
