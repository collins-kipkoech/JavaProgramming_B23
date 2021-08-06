package day23_arrays;

public class MaxMinNum {
    public static void main(String[] args) {
        int[] nums={2,4,6,8,4,9};
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
            if (nums[i]<min){
                min=nums[i];
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
