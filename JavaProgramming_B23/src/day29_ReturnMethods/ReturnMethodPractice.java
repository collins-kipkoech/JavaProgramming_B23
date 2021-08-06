package day29_ReturnMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {

    }
    public static int maxNumber(int num1,int num2){
        int result = 0;
        if (num1>num2){
            result=num1;
        }
        else {
            result=num2;
        }
        return result;
    }
}
