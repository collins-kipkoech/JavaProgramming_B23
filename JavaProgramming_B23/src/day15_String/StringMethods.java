package day15_String;

public class StringMethods {

    public static void main(String[] args) {

        String name = "collins";
        char ch = name.charAt(0);
        System.out.println("ch = " + ch);

        System.out.println("--------------------------------------");

        String s = "cybertek";
        System.out.println(s.toUpperCase());

        System.out.println("--------------------------------------");

        String s2 = "JAVA PROGRAMMING LANGUAGE";
        System.out.println(s2.toLowerCase());

        String name1 = "collins";
        name1 = name1.toUpperCase();
        System.out.println(name1);

        System.out.println("--------------------------------------");

        String schoolName = "   cybertek school    ";
        System.out.println(schoolName.trim());
    }
}
