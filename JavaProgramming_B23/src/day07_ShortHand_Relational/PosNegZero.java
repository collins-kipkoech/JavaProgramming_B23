package day07_ShortHand_Relational;

public class PosNegZero {

    public static void main(String[] args) {
        int number = 100;

        boolean isPos = number > 0;
        boolean isNeg = number < 0;
        boolean isZero = number == 0;
        System.out.println(number + " is positive number: " + isPos);
        System.out.println(number + " is negative number: " + isNeg);
        System.out.println(number + " is zero: " + isZero);


    }
}
