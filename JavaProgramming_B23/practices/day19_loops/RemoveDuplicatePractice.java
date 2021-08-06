package day19_loops;

public class RemoveDuplicatePractice {
    public static void main(String[] args) {
        String word = "aaaaabbbbbbbbbttttttttttttggggggggggf";
        String result = "";
/*
for loop statement 1 represents the character at index 0 of the word
         statement 2 represents the character at last index of the word
         statement 3 represents the iteration through the word

* */

        for (int i = 0; i < word.length(); i++) {
            if(!result.contains(""+word.charAt(i))){
                result += ""+word.charAt(i);

            }

        }
        System.out.println("result = " + result);
    }
}
