package day07_ShortHand_Relational;

public class ElligibleToVote {

    public static void main(String[] args) {

        String name = "collins kipkoech";
        int age = 34;
        String citizen = "USA";
        int creditScore = 700;

        boolean isElligibleToVote = age >= 18 && citizen == "USA" && creditScore>=700;
        System.out.println(name + " is eligible to vote " + isElligibleToVote);
    }
}
