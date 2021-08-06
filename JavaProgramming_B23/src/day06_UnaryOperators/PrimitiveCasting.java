package day06_UnaryOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {

        int e = 70000;
        short q = (short) e;
        System.out.println("q = " + q);

        System.out.println("----------------------------");
        double a = 1000.0;
        int b = (int) a;
        System.out.println("b = " + b);

        System.out.println((int)100.2345);
    }
}
