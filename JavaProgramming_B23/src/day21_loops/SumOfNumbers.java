package day21_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter number: ");
            int number = scan.nextInt();
            if(number<0){
//                System.exit(0);
                break;
            }
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
}
