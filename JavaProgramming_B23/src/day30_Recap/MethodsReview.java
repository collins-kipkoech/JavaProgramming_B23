package day30_Recap;
import utilities.StringUtility;

public class MethodsReview {
    public static void main(String[] args) {
        String str = "java";
        String result = StringUtility.reverse(str);
        System.out.println(result);

        String word = "anna";
        System.out.println(StringUtility.isPalindrome(word));
    }
}
