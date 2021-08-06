package day32_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask2 {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int num=10;
        nums= addInteger(nums,num);
        System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------------------------------");

        double[] nums1 = {10.5,10.6};
        double num1=10.8;
        System.out.println(Arrays.toString(addDouble(nums1,num1)));

        System.out.println("------------------------------------------------------");

        String[] str={"collins","kipkoech"};
        String name = "cheruiyot";
        System.out.println(Arrays.toString(addString(str,name)));

        //--------------------------------method overload------------------------------------
    }
    public static int[] addInteger(int[] array,int number){
        int[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1] =number;
        return result;
    }

    public static double[] addDouble(double[] array,double number){
        double[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;
        return result;
    }

    public static String[] addString(String[] array,String str){
        String[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]= str;
        return result;
    }

    public static char[] addChar(char[] array,char each){
        char[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]=each;
        return result;
    }

    //------------------------------method overload----------------------------

    public static int[] addElement(int[] array,int number){
        int[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1] =number;
        return result;
    }

    public static double[] addElement(double[] array,double number){
        double[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;
        return result;
    }

    public static String[] addElement(String[] array,String str){
        String[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]= str;
        return result;
    }

    public static char[] addElement(char[] array,char each){
        char[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]=each;
        return result;
    }


}
