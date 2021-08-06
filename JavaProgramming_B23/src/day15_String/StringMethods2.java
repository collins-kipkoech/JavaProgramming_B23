package day15_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "Java programming language";
        String name = sentence.substring(0,4);
        System.out.println(name);

        System.out.println("--------------------------------------------");

        String s = "cybertek school";
        String s2 = s.substring(0,8);
        System.out.println(s2);

        System.out.println("--------------------------------------------");

        String sentence2 = "java is a programming language";
        String name3 = sentence2.substring(10);
        System.out.println(name3);


        System.out.println("--------------------------------------------");

        String sentence3 = "python is an easy language";
        sentence3=sentence.replace("python","java");
        System.out.println(sentence3);

    }
}
