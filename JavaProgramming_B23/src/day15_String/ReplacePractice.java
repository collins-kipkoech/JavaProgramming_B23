package day15_String;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "cybertek";
        String result = word.replace('c','k');
        System.out.println("result = " + result);

        System.out.println("----------------------------------------");
        String word1 = "cybertek school";
        String result1 = word1.replace("school","company");
        System.out.println("result1 = " + result1);
    }
}
