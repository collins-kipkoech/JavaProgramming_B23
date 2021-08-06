package day24_Arrays;

import java.util.Arrays;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String sentence="I love coding in java";
        String[] sentence1=sentence.split(" ");//splits the string at a specified character and returns a string array
        System.out.println(Arrays.toString(sentence1));

        for (int i = 0; i < sentence1.length; i++) {
            System.out.println(sentence1[i]);

        }

        System.out.println("-------------------------------------------------------------");

        String email="collinskipkoech@gmail.com";
        String[] newEmail=email.split("@");
        System.out.println(Arrays.toString(newEmail));

        System.out.println("-------------------------------------------------------------");

        String name="collins";
        char[] ch=name.toCharArray();
        System.out.println(Arrays.toString(ch));


    }
}
