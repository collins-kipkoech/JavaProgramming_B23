package day25_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop_Practice {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D"},
                arr2 = {"E", "F"};
        String[] arr3=new String[arr1.length+ arr2.length];
        int i=0;

        for (String each : arr1) {
            arr3[i++]=each;

        }
        for (String each : arr2) {
            arr3[i++]=each;

        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------------------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int even =0;
        int odd=0;

        for (int number : numbers) {
            if (number%2==0){
                even++;

            }
            else{
                odd++;
            }

        }
        System.out.println(odd);
        System.out.println(even);
    }
}
