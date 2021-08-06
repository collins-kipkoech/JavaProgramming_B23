package day05_ArithmeticOperators;

public class ArithmeticPractice {

    public static void main(String[] args) {
        int number = 21;

        boolean isEvenlyDivisibleByThree = number%3 == 0;
        boolean isNotEvenlyDivisibleBy5 = number%5 == 0;
        System.out.println(number + " is divisible by 3 " + isEvenlyDivisibleByThree);
        System.out.println(number + " is divisible by 5 " + isNotEvenlyDivisibleBy5);


    }
}
