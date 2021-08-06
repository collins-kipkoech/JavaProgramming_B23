package day15_String;

public class SubStringPractice {
    public static void main(String[] args) {

        String sentence = "My favourite tv series is the walking dead";
        String tvSeries = sentence.substring(30);
        System.out.println(tvSeries);

        System.out.println("---------------------------------");

        String sentence2 = "java is a fun language";
        String s1 = sentence2.substring(10,13);
        System.out.println(s1);
    }
}
