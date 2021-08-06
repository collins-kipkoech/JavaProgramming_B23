package day05_ArithmeticOperators;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number%2 == 0; //if the remainder is zero, then the number is even number
        boolean isOdd = number%2 > 0; // if the remainder is greater than zero, then the number is odd number
        System.out.println(number + " is an even number " + isEven);
        System.out.println(number + " is an odd number " + isOdd);
    }
}
