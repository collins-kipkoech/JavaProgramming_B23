package day18_Recap;

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();

//        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
//            System.out.println(word1+word2.substring(1));
//        }
//        else{
//            System.out.println(word1+word2);
//        }

        if(word1.substring(word1.length()-1).equalsIgnoreCase(""+word2.charAt(0))){
            System.out.println(word1+word2.substring(1));

        }
        else{
            System.out.println(word1+word2);

        }

    }
}
/*

2. Ask user to enter two words. Then add them together and print. But if the last letter
if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

* */
