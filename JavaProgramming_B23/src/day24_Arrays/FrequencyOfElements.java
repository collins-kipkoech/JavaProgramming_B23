package day24_Arrays;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4};


        for (int j = 0; j < arr.length; j++) {
            int element = arr[j];//element at index 0
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==element){
                    count++;
                }

            }
            if (count==1){
                System.out.println(element+" ");
            }

        }


    }
}
/*
2. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
* */
