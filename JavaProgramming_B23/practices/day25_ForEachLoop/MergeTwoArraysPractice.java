package day25_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArraysPractice {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,100, 200, 300, 400, 500, 600},
                arr2 = {5,6, 1000, 2000, 3000, 4000, 5000, 8000, 9000};

        int[] arr3 = new int[arr1.length+ arr2.length];//makes sure that arr3 has enough capacity to hold values in arr1 and arr2

        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++]=arr2[i];

        }

        System.out.println(Arrays.toString(arr3));
    }
}
