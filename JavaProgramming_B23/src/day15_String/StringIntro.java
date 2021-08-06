package day15_String;
import java.lang.String;

public class StringIntro {

    public static void main(String[] args) {
        String str = "Cybertek";//literal
        String str2 = new String("cybertek");

        System.out.println("-------------------------------");
        String s1 = "cat";
        String s2 = "cat";
        String s3 = "cat";

        System.out.println(s1==s2);


        System.out.println("-------------------------------");

        String s4 = new String("cat");
        String s5 = new String("cat");
        String s6 = new String("cat");
        String s7 = s4;

        System.out.println(s4==s5); // false
        System.out.println(s5==s6); // false
        System.out.println(s7==s4); // true




    }
}
