package day29_ReturnMethods;

import java.util.Arrays;

public class RemoveDupMethodPractice {
    public static void main(String[] args) {
        String str = "AAABBBBBCCCCCDDDDDDDDDDDDDDDEEEEEEEEEEEEEFFFFFFFFFFFFFF";
        System.out.println(removeDup(str));

        System.out.println("------------------------------------------");

        String word1="heart";
        String word2="earth";
        System.out.println(isAnagram(word1,word2));

    }

    //method to remove duplicate
    public static String removeDup(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);

            }

        }
        return result;
    }

    //method to check if two strings is anagram
    public static boolean isAnagram(String str1,String str2){
        char[] word1=str1.toCharArray();
        char[] word2 =str2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        boolean isAnagram = Arrays.equals(word1,word2);
        return isAnagram;
    }
}
