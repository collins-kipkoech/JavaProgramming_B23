package day12_scanner;

import java.util.Scanner;

public class DaysInAWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day==3){
            System.out.println("Wednesday");
        }
    }
}
