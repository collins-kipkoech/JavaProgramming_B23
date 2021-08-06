package day33_Methods;

public class WarmUpTask1 {

//    reverse the int the array,return int array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            result[j]=array[i];

        }
        return result;

    }

    //    reverse the string the array,return string array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            result[j]=array[i];

        }
        return result;

    }

    //    reverse the double the array,return double array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            result[j]=array[i];

        }
        return result;

    }

    //    reverse the character in the array,return char array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            result[j]=array[i];

        }
        return result;

    }


}
/*
Task 1:
    1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char

* */