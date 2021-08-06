package day21_loops;

public class LetterDigitsSpecialCharPractice {

    public static void main(String[] args) {
        String word = "mn@#123Ab!";
        String letters = "";
        String digits="";
        String specialChar = "";

        for (int i = 0; i <=word.length()-1 ; i++) {
            char each = word.charAt(i);
            if(each>='a' && each<='z'){
                letters+=each;
            }
            else if(each>='A' && each<='Z'){
                letters+=each;
            }
            else if(each>='0' && each<='9'){
                digits+=each;

            }
            else{
                specialChar+=each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);




    }
}
/*
4. write a program that can relative the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
* */

