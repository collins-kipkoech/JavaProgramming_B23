package day19_loops;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
     int a=0;
     do {
         a=a++ + --a -(a*3);

     }while (a++<4);
     System.out.println(a);



    }
}
