package day21_loops;

public class WhileLoop {
    public static void main(String[] args) {
        String sentence = "java is fun, java is cool";
        int countJava = 0;

        while(sentence.contains("java")){
            countJava++;
            sentence = sentence.replaceFirst("java","");
        }
        System.out.println("countJava = " + countJava);
    }
}
