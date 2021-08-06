package day24_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        //split() method
        String sentence = "i love learning java programming language";
        String[] word = sentence.split(" ");
        //System.out.println(Arrays.toString(word));
        for (int i = word.length-1; i >=0  ; i--) {
            System.out.println(word[i]);


        }

        System.out.println("---------------------------------------------------------");

        String email = "cybertek@gmail.com";
        String firstName = email.split("@")[0];
        System.out.println("firstName = " + firstName);
    }
}
