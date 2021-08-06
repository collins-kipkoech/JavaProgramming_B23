package day24_Arrays;

import java.util.Arrays;

public class AnagramPractice {
    public static void main(String[] args) {
        String word1="earth";
        String word2="heart";

        char[] ch1=word1.toCharArray();
        char[] ch2 =word2.toCharArray();

//        System.out.println(Arrays.toString(ch1));
//        System.out.println(Arrays.toString(ch2));
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram=Arrays.equals(ch1,ch2);
        System.out.println(isAnagram);

    }
}
