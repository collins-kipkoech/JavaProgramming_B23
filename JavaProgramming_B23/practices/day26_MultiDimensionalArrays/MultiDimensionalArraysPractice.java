package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysPractice {

    public static void main(String[] args) {
        int[][] arr2D={{1,2,3,4},{5,6,7,8},{9,10}};
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(arr2D[0][2]);

        System.out.println("------------------------------------------------");

        for (int[] each : arr2D) {
//            System.out.println(Arrays.toString(each));
            for (int num : each) {
                System.out.println(num);

            }

        }

        System.out.println("------------------------------------------------");


    }

}
