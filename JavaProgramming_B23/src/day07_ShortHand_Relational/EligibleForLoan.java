package day07_ShortHand_Relational;

public class EligibleForLoan {

    public static void main(String[] args) {

        String name = "collins";
        int age = 25;
        int workHistory = 4;
        int income = 400000;
        int creditScore = 800;

        boolean isEligibleForLoan = age>=18 && income>=60000 && workHistory>=2 && creditScore>=700;
        System.out.println(name + " is eligible for loan: " + isEligibleForLoan);
    }
}
/*
3. EligileForLoan
            income has to be at least 60k
            at least have 2 years of work history
            at least have 700 of credit score
            at least 18 years old

        variables:    name, age, workHistory, creditScore, income
* */
