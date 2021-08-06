package day25_ForEachLoop;

import java.util.Arrays;

public class MergeThreeArraysPractice {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,100, 200, 300, 400, 500, 600},
                arr2 = {5,6, 1000, 2000, 3000, 4000, 5000, 8000, 9000},
                arr3={10,20,30,40,50};

        int[] arr4 = new int[arr1.length+ arr2.length+ arr3.length];

        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            arr4[j++]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arr4[j++]=arr2[i];

        }
        for (int i = 0; i < arr3.length; i++) {
            arr4[j++]=arr3[i];

        }

        System.out.println(Arrays.toString(arr4));
    }
}
