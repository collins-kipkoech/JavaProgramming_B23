package day31_Recap;

import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaabbbbbbbbbccccccccccccuuuuuuuuuuuuteeeeeeee";

        System.out.println(removeDuplicate(str));

        System.out.println("-------------------------------------------");

        String s1="earth",s2="heart";
        System.out.println(isAnagram(s1,s2));
    }
    public static String removeDuplicate(String str){
        String result = "";
        for (char ch:str.toCharArray()
             ) {
            if (result.indexOf(ch)<0){//!result.contains(""+ch)
                //if the character is not contained in the result,then concate the character
                result+=ch;

        }

        }


        return result;
    }

    public static boolean isAnagram(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    public static int frequency(String str,char ch){
        int count = 0;
        for (char each:str.toCharArray()
             ) {
            if (each==ch){
                count++;
            }
            
        }
        return count;
    }

}
/*
// create a method that can remove duplicates from string, returns string
            // removeDup("AAABBBBBBCCCCCCC") ===> "ABC"
* */
