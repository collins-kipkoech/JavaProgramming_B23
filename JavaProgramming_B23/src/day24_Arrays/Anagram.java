package day24_Arrays;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String word1 = "heart";
        String word2 = "earth";

        //toCharArray() method converts a string into a sequence of characters
        //returns an array
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        //Arrays.sort() sorts an array in ascending order
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        //Arrays.equals() method checks whether two arrays are equal and in the same order
        boolean isSame = Arrays.equals(ch1,ch2);

        System.out.println("isSame = " + isSame);
        



    }
}
 /*
    heart && earth
    race && care
    listen && silent
    output: true
     */
