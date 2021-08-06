package day19_loops;

import java.util.Scanner;

class Remove_Duplicate_Practice2 {
    public static void main(String[] args) {
        System.out.println("Enter word:");
        String word = new Scanner(System.in).next();
        String result = "";

        if(word.length()==5){
            for (int i = 0; i <=word.length()-1 ; i++) {
                System.out.print(word.charAt(i));

                if (!(result.contains(""+word.charAt(i)))){
                    result += word.charAt(i);
                }

            }
            System.out.println();
            System.out.println(result);


        }
        else if(word.length()>5){
            System.out.println("Too long");
        }
        else{
            System.out.println("Too short");
        }

    }
}
/*
1. ask the user to enter a word. the word must be five characters
 long and print the word without the duplicated characters, but if the word
 is less than five characters long, print "Too Short." and if the word is more than five
  characters long, print "Too long."

        Ex:
            input:
                aabbc

             output:
                 abc
* */
