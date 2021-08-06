package day07_ShortHand_Relational;

public class UnaryPractice {

    public static void main(String[] args) {

        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
/*
2. manually calculate the following code fragments:

          1. int a = 100;
             int b = -a++ + ++a - a-- * a-- % 2
* */
