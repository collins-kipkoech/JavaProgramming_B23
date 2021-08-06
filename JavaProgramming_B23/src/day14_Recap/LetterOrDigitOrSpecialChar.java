package day14_Recap;

public class LetterOrDigitOrSpecialChar {

    public static void main(String[] args) {

        char ch = '!';
        boolean isDigit = ch>='0' && ch<='9';
        //if the character is between 0 to 9
        boolean isLetter = (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') ;
        //if the character is upper case letter or lower case letter
        //boolean isSpecialCharacter = !isLetter && !isDigit;
        String result = "";
        if(isDigit){
            result=ch + " is digit";
        }
        else if(isLetter){
            result=ch + " is a letter";
        }
        else{
            result=ch + " is a special character";
        }
        System.out.println("result = " + result);
    }
}
