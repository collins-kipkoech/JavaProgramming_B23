package day23_arrays;

import java.util.Arrays;

public class TwoDimensionalArrayPractice {

    public static void main(String[] args) {
//        two dimensionals array is an array that has one dimensional arrays as its elements
        int[][] numbers={{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println(Arrays.deepToString(numbers));//display elements of two dimensional array
        System.out.println(Arrays.toString(numbers[0]));//display one dimensionl array
        System.out.println(numbers[0][1]);//display the first element in the first element of 2d

        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);

            }

        }
    }
}
