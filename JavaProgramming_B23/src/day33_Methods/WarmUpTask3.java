package day33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask3 {

    public static void main(String[] args) {
        int[] array ={1,1,1,2,3,4,5,5,6};
        int[] result={};

        for (int each : array) {//getting each element
            if (frequency(array,each)==1){//unique element
                result=ArraysUtility.addElement(result,each);
            }
        }
        System.out.println(Arrays.toString(result));
    }

// method than can return frequency of a number,returns int
    public static int frequency(int[] array,int element){
        int count=0;
        for (int each: array
             ) {
            if (each==element){
                count++;
            }

        }
        return count;
    }

//   method than can return frequency of a double,returns int
    public static int frequency(double[] array,double element){
        int count=0;
        for (double each: array
        ) {
            if (each==element){
                count++;
            }

        }
        return count;
    }

//    method than can return frequency of a string,returns int
    public static int frequency(String[] array,String element){
        int count=0;
        for (String each: array
        ) {
            if (each.equals(element)){
                count++;
            }

        }
        return count;
    }

//    method than can return frequency of a character,returns int
    public static int frequency(char[] array,char element){
        int count=0;
        for (char each: array
        ) {
            if (each==element){
                count++;
            }

        }
        return count;
    }






}
