package day26_MultiDimensionalArrays;

public class CommonElementsPractice {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = {4,5,6,7,8, 9, 10 , 11};

        for (int each : arr1) {//loop through the elements of arr1
            for (int element : arr2) {//loop through the element of arr2
                if (each==element){//
                    System.out.println(each);
                }

            }

        }
    }
}
