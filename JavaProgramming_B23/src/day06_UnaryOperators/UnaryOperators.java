package day06_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        //int a = 100;
        //a++; //pre increment: increase immediately
        //System.out.println("a = " + a);
        //System.out.println(++a);

        System.out.println("------------------------------------");

        int n1 = 50;
        int n2 = n1++;

        System.out.println("n2 = " + n2);
        System.out.println("n1 = " + n1);

        System.out.println("------------------------------------");

        int r = 200;
        System.out.println(r++);
        System.out.println(r);

        System.out.println("------------------------------------");

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        System.out.println(a);



    }
}
