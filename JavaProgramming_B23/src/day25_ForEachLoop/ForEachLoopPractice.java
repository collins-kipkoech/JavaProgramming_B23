package day25_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] arr1 ={"a","b","c","d"},arr2 = {"e","f"};
        String[] arr3 = new String[arr1.length+arr2.length];
        int j=0;

        for (String each:arr1
             ) {
            arr3[j++] = each;

        }
        for (String each:arr2
        ) {
            arr3[j++] = each;

        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------");
        
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};
        int countOdd =0,countEven= 0;

        for (int number: numbers
             ) {
            if(number%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
            
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

    }
}
