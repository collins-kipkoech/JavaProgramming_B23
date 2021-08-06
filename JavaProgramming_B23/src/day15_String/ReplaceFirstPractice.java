package day15_String;

public class ReplaceFirstPractice {
    public static void main(String[] args) {
        String word = "school school";
        String result = word.replaceFirst("school","company");
        System.out.println("result = " + result);
    }
}
