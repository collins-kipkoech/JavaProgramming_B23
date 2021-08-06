package day32_methodsOverloading;

import java.util.Arrays;

public class AddElementToArrayPractice {

    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int number=5;
        System.out.println(Arrays.toString(addElement(array,number)));

        System.out.println("----------------------------------------------------------");

        double[] array1 ={1.0,2.0,3.0,4.0};
        double number1=5.0;
        System.out.println(Arrays.toString(addElement(array1,number1)));

        System.out.println("--------------------------------------------------------------");
        String[] names={"collins","kipkoech"};
        String lastName="cheruiyot";
        System.out.println(Arrays.toString(addElement(names,lastName)));

        System.out.println("--------------------------------------------------------------");

        char[] chars={'a','b','c','d'};
        char ch = 'e';
        System.out.println(Arrays.toString(addElement(chars,ch)));






    }

    //----------------------------method overloading--------------------------------------------

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






}
/*
Task2:
	1. create a return method called addElement that can add an Integer  after the  last index of an integer array
    2. create a return method called addElement that can add a double after the last index of a double array
    3. create a return method called addElement that can add a String after the last index of a String array
    4. create a return method called addElement that can add a char after last index of a char array
 */

