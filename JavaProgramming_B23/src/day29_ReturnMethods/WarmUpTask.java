package day29_ReturnMethods;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {
        posNegZero(0);
        int[] numbers = {10,20,0,-20,-5};
        for (int number : numbers) {
            posNegZero(number);

        }

        System.out.println("--------------------------------------------");
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        mergeTwoArrays(array1,array2);

        System.out.println("--------------------------------------------");

        formatName("COllins","kipkoech");

        System.out.println("--------------------------------------------");

        maxNumber(60,10);


    }
    public static void posNegZero(int number){
        if (number>0){
            System.out.println(number+" is a positive number");
        }
        else if(number<0){
            System.out.println(number+" is a negative number");
        }
        else{
            System.out.println(number+" is zero");
        }

    }

    public static void mergeTwoArrays(int[]arr1,int[] arr2){
        int[] arr3 =new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
            arr3[i++]=each;

        }
        for (int each : arr2) {
            arr3[i++]=each;

        }
        System.out.println(Arrays.toString(arr3));

    }

    public static void formatName(String firstName,String lastName){
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
    }

    public static void maxNumber(int num1,int num2){
        if (num1>num2){
            System.out.println(num1+" is greater");
        }
        else{
            System.out.println(num2+" is greater");
        }
    }



}
/*
1. create a function that can check if the given integer is positive, negative or zero

2. create a function that can print out the combination of two integer arrays

3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
4. create a function that can print out the maximum number between two numbers

5. create a function that can print out the array of integers in descending order
* */
