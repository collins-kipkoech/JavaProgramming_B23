package day23_arrays;

import java.util.Arrays;

public class ArraysUtilityPractice {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(numbers));

        String[] names = {"collins","kipkoech","mercy","cheptoo"};
        System.out.println(Arrays.toString(names));//prints the elements in the one dimensional array
        System.out.println(names);//prints the hashcode

        System.out.println("-------------------------------------------------------------------");

        int[] nums = {3,8,9,10,20,1,4,5,9};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(names);//sorts the elements in the array in an ascending order
        System.out.println(Arrays.toString(names));

        System.out.println("-------------------------------------------------------------------");

        char[] ch = {'a','k','i','t','h','d'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        System.out.println("-------------------------------------------------------------------");

        int[] num1={1,2,3,4};
        int[] num2={1,2,3,4};


        boolean num3=Arrays.equals(num1,num2);
        System.out.println(num3);

    }
}
