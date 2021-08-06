package day23_arrays;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabcccd";
        char ch = 'c';
        int frequency = 0; // for the frequency of ch

        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // each character in the string
            if(each==ch){ // if the character is matching with ch
                frequency++; //increase each character by one
            }

        }
        System.out.println("frequency = " + frequency);

    }
}
/*
*1. Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
* */
