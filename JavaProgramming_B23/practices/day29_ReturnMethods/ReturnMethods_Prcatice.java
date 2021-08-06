package day29_ReturnMethods;

public class ReturnMethods_Prcatice {
    public static void main(String[] args) {
        String word = "Anna";
        word=word.toLowerCase();
        System.out.println(reverse(word));

        System.out.println(isPalindrome(word));

    }

    public static String reverse(String str){
        String result = "";
        for (int i =str.length()-1 ; i >=0 ; i--) {
            result+=str.charAt(i);

        }
        return result;
    }

    public static boolean isPalindrome(String str){
        return (str.equals(reverse(str)))?true:false;
    }
}
