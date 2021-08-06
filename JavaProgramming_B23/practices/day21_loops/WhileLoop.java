package day21_loops;

class WhileLoopPractice {
    public static void main(String[] args) {

        String sentence = "java is fun,java is cool";
        int count =0;

        while (sentence.contains("java")){
            count++;
            sentence = sentence.replaceFirst("java","");
        }
        System.out.println(count);

    }
}
