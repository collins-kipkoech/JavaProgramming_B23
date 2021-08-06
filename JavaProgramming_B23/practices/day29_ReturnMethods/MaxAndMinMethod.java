package day29_ReturnMethods;

public class MaxAndMinMethod {
    public static void main(String[] args) {
        System.out.println(max(20,100));
        System.out.println(min(20,10));

        System.out.println("--------------------------------------");
        int[] array = {10,30,40,60,20,23,45,46};
        System.out.println(maxNumInArray(array));
        System.out.println(minNumInArray(array));

    }
//method to return maximum number
    public static int max(int num1,int num2){
        return (num1>num2)?num1:num2;
    }
   //method to return minimum number
    public static int min(int num1,int num2){
        return (num1<num2)?num1:num2;
    }

    //method to return maximum number in an array
    public static int maxNumInArray(int[] numbers){
        int max = numbers[0];
        for (int number : numbers) {
            max = max(max,number);

        }
        return max;
    }

    //method to return minimum number in an array
    public static int minNumInArray(int[] numbers){
        int min=numbers[0];
        for (int number : numbers) {
            min=min(min,number);

        }
        return min;
    }
}
