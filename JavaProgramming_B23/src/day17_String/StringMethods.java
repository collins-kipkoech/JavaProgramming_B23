package day17_String;

public class StringMethods {
    public static void main(String[] args) {

        String sentence = "my favourite programming language is C#,java and javascript";
        boolean hasPython = sentence.contains("python");
        boolean hasJava = sentence.contains("java");
        System.out.println(hasPython);
        System.out.println(hasJava);

        System.out.println("-------------------------------------------");
        String sentence2 = "cybertek is the best school";
        boolean startsWithCybertek = sentence2.startsWith("cybertek");
        boolean startsWithSchool = sentence2.startsWith("school");
        System.out.println(startsWithCybertek);
        System.out.println(startsWithSchool);

    }
}
