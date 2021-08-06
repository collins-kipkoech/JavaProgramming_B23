package day30_Recap;

public class LoopsReview3 {
    public static void main(String[] args) {
        String sentence = "i love java,java is cool";
        String word = "java";
        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst(word,"");

        }
        System.out.println(count);
    }
}
