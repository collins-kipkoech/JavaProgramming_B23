package day16_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "cybertek@gmail.com";
        int beginningIndex = email.indexOf("@")+1;
        int lastIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex,lastIndex);
        System.out.println(domain);
    }
}
