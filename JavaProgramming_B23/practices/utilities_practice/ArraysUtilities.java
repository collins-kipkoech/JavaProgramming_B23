package utilities_practice;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {
        int[] nums={1,6,7,8,5,4};
        System.out.println(max(nums));

        System.out.println("===============================================");

        int[] array1={1,2,3,4},array2={5,6,7,8,9,10};
        System.out.println(Arrays.toString(merge(array1,array2)));

        System.out.println("===============================================");
        int num=2;
        System.out.println(Arrays.toString(remove(nums,num)));

        System.out.println("===============================================");

        String[] names={"collins","kipkoech","cheruiyot"};
        String word="collins";
        System.out.println(contains(names,word));
        System.out.println(contains(nums,100));
        System.out.println(Arrays.toString(reverse(names)));
        System.out.println(Arrays.toString(reverse(nums)));



    }
    //method to add an int element at the last index of an array
    public static int[] addElement(int[] array,int number){
        int[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;

        return result;

    }
    //method to add a double element at the last index of an array
    public static double[] addElement(double[] array,double number){
        double[] result=Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;
        return result;
    }

    //method to add a string element at the last index of an array
    public static String[] addElement(String[] array,String word){
        String[] result=Arrays.copyOf(array,array.length+1);
        result[result.length-1]=word;
        return result;
    }

    //method to add a char element at the last index of an array

    public static char[] addElement(char[] array,char ch){
        char[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]=ch;
        return result;
    }

    //=========================================max methods==========================================

    //method to return a maximum int element
//    public static int max(int num1,int num2){
//        int result=0;
//        if (num1>num2){
//            result=num1;
//
//        }
//        else{
//            result=num2;
//        }
//        return result;
//    }
//
//    //method to return a maximum double element
//    public static double max()




    //=========================================max methods from array==========================================
    //method to return the maximum int element in an array
    public static int max(int[] array){
        int max=array[0];
        for (int each : array) {
//            if (each>max){
//                max=each;
//
//            }
            max=Math.max(max,each);

        }
        return max;

    }

    //method to return the maximum double element in an array
    public static double max(double[]array){
        double max=array[0];
        for (double each : array) {
//            if (each>max){
//                max=each;
//            }
            max=Math.max(max,each);

        }
        return max;
    }

    //=======================methods to merge two arrays=============================
    //method to merge two int arrays
    public static int[] merge(int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+ arr2.length];
        int j=0;
        for (int each : arr1) {
            arr3[j++]=each;

        }
        for (int each : arr2) {
            arr3[j++]=each;

        }
        return arr3;
    }

    //method to merge two double arrays
    public static double[] merge(double[] arr1,double[] arr2){
        double[] arr3=new double[arr1.length+ arr2.length];
        int j=0;
        for (double each : arr1) {
            arr3[j++]=each;

        }
        for (double each : arr2) {
            arr3[j++]=each;

        }
        return arr3;
    }

    //method to merge two String arrays
    public static String[] merge(String[] arr1,String[] arr2){
        String[] arr3=new String[arr1.length+ arr2.length];
        int j=0;
        for (String each : arr1) {
            arr3[j++]=each;

        }
        for (String each : arr2) {
            arr3[j++]=each;

        }
        return arr3;
    }

    //method to merge two char arrays
    public static char[] merge(char[] arr1,char[] arr2){
        char[] arr3=new char[arr1.length+ arr2.length];
        int j=0;
        for (char each : arr1) {
            arr3[j++]=each;

        }
        for (char each : arr2) {
            arr3[j++]=each;

        }
        return arr3;
    }


    //=======================remove methods=============================
    //method to remove int element in an int array
    public static int[] remove(int[] array,int index){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index");
            System.out.println("Please enter valid index");
            System.exit(0);
        }

            int[] result=new int[array.length-1];

            int j=0;
            for (int i = 0; i < array.length; i++) {
                if (i==index){
                    continue;
                }
                else {
                    result[j++]=array[i];

                }

            }



        return result;


    }

    //method to remove double element in an double array
    public static double[] remove(double[] array,int index){

        if (index<0 || index> array.length-1){
            System.out.println("Invalid index");
            System.out.println("Please enter valid index");
            System.exit(0);
        }

        double[] result=new double[array.length-1];

        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            else {
                result[j++]=array[i];

            }

        }



        return result;


    }

    //=======================contains methods=============================
    //method to check if a particular string is in an array
    public static boolean contains(String[] array,String word){

        for (String each : array) {
            if (each.equals(word)){
                return true;

            }

        }
        return false;
    }

    //method to check if a particular int is in an array
    public static boolean contains(int[] array,int number){
        for (int each : array) {
            if (each==number){
                return true;
            }

        }
        return false;
    }

    //method to check if a particular double is in an array
    public static boolean contains(double[] array,double number){
        for (double each : array) {
            if (each==number){
                return true;
            }

        }
        return false;
    }

    //method to check if a particular char is in an array
    public static boolean contains(char[] array,char ch){
        for (char each : array) {
            if (each==ch){
                return true;
            }

        }
        return false;
    }


    //=======================reverse methods=============================
    //method to reverse a string array
    public static String[] reverse(String[] array){
        String[] result=new String[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--) {
            result[j++]=array[i];

        }
        return result;
    }

    //method to reverse a int array
    public static int[] reverse(int[] array){
        int[] result=new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--) {
            result[j++]=array[i];

        }
        return result;
    }









}
