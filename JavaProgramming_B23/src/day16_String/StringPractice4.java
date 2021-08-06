package day16_String;

import java.util.Scanner;

public class StringPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three words:");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        String result = "";
        boolean allSame = word1.length()==word2.length() && word1.length()==word3.length();
        boolean notSame = word1.length() != word2.length() && word1.length() != word3.length() && word2.length() != word3.length();

        if(allSame){
            result="All words are same length";

        }
        else if(notSame){
            result="Not Same nor Different lengths";

        }
        else{
            result="All different length";
        }
        System.out.println("result = " + result);
        scan.close();


    }
}
/*
4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
* */
