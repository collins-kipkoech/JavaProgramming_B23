package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysPractice1 {
    public static void main(String[] args) {
        int[][][] arr3D ={ {{1,2,3,4},{5,6}}, {{7,8},{9,10}} };
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[0]));//prints out 2D array at index 0
        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(arr3D[0][0][2]);

        System.out.println("------------------------------------------------------------");

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int each : each1D) {
                    System.out.println(each);

                }

            }

        }

    }
}
