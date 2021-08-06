package day16_String;

import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.next();

        if(word.length()==3){
            if(word.charAt(1)=='a'){
                System.out.println("Cool word");
            }
            else{
                System.out.println("Okay word");
            }

        }
        else{
            if(word.length()>3){
                System.out.println("word too long");
            }
            else{
                System.out.println("word too short");
            }

        }
        scan.close();

    }
}
/*
3. write a program that asks the user enter a three letter word. Check if the middle character of
the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter
is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

* */
