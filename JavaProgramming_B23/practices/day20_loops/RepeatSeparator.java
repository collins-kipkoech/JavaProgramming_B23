package day20_loops;


import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        String result = word;

        int count = scan.nextInt();
        for (int i = 0; i < count-1; i++) {
            result += separator+word ;

        }
        System.out.println(result);


    }
}

