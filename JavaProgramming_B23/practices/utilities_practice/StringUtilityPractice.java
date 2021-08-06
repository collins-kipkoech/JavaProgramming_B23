package utilities_practice;

import java.util.Arrays;

public class StringUtilityPractice {
    public static void main(String[] args) {
        String result = reverse("school");
        System.out.println(result);

        System.out.println(isPalindrome("anna"));

        System.out.println(removeDup("aaccrrnhsrreee"));

        System.out.println(anagram("earth","heart"));

        System.out.println(frequency("collins"));
    }
//    string reverse method, returns string
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);

        }
        return reverse;
    }

//    palindrome method,returns boolean
    public static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);

        }
        return reverse.equals(str);
    }

//    method to remove duplicate character in a string, returns a string
    public static String removeDup(String str){
        String result = "";
        for (char ch:str.toCharArray()
             ) {
            if (!result.contains(""+ch)){
                result+=ch;
            }

        }

        return result;

    }

//    anagram method, returns boolean
    public static boolean anagram(String str1,String str2){
        char[] word1=str1.toCharArray();
        char[]word2=str2.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);

        boolean isAnagram = Arrays.equals(word1,word2);
        return isAnagram;
    }

//    frequency of a character method,returns int
    public static int frequency(String word){
        int count=0;
        char ch = 'l';
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==ch){
                count++;
            }


        }
        return count;


    }

}
