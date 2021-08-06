package day16_String;

public class StringMethods {
    public static void main(String[] args) {

        String email = "cyrtek@yahoo.com";
        email=email.replace("yahoo","gmail");
        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        //sentence = sentence.replace("C#","Java");//replaces all matching
        sentence = sentence.replace("C#","Java");//replaces first matching only
        System.out.println(sentence);

        String s = "cat dog cat dog cat";
        //s = s.replace("cat","dog");
        s=s.replaceFirst("cat","dog");
        System.out.println(s);

        System.out.println("-----------------------------------------------");

        String sentence2 = "Java is a cool language";
        int indexOfA=sentence2.indexOf("a");
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf("a c");
        int indexOfFourthA = sentence2.indexOf("an");
        System.out.println(indexOfA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfFourthA);

        System.out.println("-----------------------------------------------");

        String s2 = "";
        boolean r1=s2.isEmpty();
        System.out.println(r1);
    }
}
