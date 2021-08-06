package day28_methods;

import java.util.Scanner;

public class VoidMethodsPractice {
    public static void main(String[] args) {
//        oddNum(100);
//        evenNum(10,100);
//        age(1995,2021);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();



        eligibleToVote(age,false);


    }

    //method to print odd numbers
    public static void oddNum(int num){
        for (int i = 0; i <=num ; i++) {
            if (i%2 !=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
//method to get even numbers between any given two numbers
    public static void evenNum(int begin,int end){
        for (int i = begin; i <=end ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
//method to get the age of a person
    public static void age(int birthYear,int currentYear){
        System.out.println(currentYear-birthYear);
    }

    public static void eligibleToVote(int age,boolean isKenyan){
        if (age>18 && isKenyan==true){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }


}
/*
 1. create a method that can print odd numbers between 1~100 in a same line seperated by space
    2. create a method that can print even numbers between any given two numbers
    3. create a method that can calculate the age of the person
    4. check eligibility to vote
 */
