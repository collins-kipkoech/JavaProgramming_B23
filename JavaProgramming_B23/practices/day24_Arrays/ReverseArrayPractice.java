package day24_Arrays;

import java.util.Arrays;

public class ReverseArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        int[] reverse=new int[nums.length];

        for (int i = nums.length-1,j=0; i >=0 ; i--) {
            reverse[j++]=nums[i];


        }
        System.out.println(Arrays.toString(reverse));
    }
}
