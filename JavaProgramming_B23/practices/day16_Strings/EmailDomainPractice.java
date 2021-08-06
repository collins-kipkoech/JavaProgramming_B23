package day16_Strings;

public class EmailDomainPractice {

    public static void main(String[] args) {

        String email = "cybertek@gmail.com";
        int first = email.indexOf("@")+1;
        int last = email.indexOf(".");
        String domain = email.substring(first,last);
        System.out.println(domain);


    }
}
