package day08_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 100;

        boolean odd = number%2 !=0;

        if(odd){ // if the number is odd
            System.out.println(number + " is odd number");
        }
        if(!odd){ // is not an odd number
            System.out.println(number + " is even number");
        }
    }
}
