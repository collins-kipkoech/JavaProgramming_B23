package day27_Recap;

public class FirstUniqueElement {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4};
        int firstUniqueElement = 0;
        int frequency = 0;
        for (int j = 0; j < nums.length; j++) {//outer loop: responsible for repeating the inner loop to find frequency of every element
            for (int i = 0; i < nums.length; i++) { // finding the frequency of every single element
                if(nums[i]==nums[j]){
                    frequency++;

                }
            if (frequency==1){//if element is unique
                firstUniqueElement=nums[j];
                break;//to make sure that only first unique element is returned from the loop
            }

            }

        }

    }
}
