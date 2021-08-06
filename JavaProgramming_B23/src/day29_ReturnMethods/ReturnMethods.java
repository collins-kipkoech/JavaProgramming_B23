package day29_ReturnMethods;

public class ReturnMethods {

    public static void main(String[] args) {

    }
    public static void reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);

        }
    }
}
