package day07_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        String name1 = "collins";
        String name2 = "kipkoech";

        String name3 = name1;
        name1 = name2;
        name2 = name3;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("-------------------------");

        int a = 100;
        a = 100 + 300;

        System.out.println("-------------------------");

        int balance = 300;
        balance+=200;
        balance+=1000;
        System.out.println("balance = " + balance);

        System.out.println("-------------------------");
        
        String school = "cybertek";
        school+=" school";
        System.out.println("school = " + school);

        System.out.println("-------------------------");
        balance-=200;
        System.out.println("balance = " + balance);

        System.out.println("-------------------------");
        double salary = 100000;
        salary*=2;
        System.out.println("salary = " + salary);

    }
}
