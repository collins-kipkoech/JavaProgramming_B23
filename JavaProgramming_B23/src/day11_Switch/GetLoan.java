package day11_Switch;

public class GetLoan {

    public static void main(String[] args) {

        int salary = 80000;
        int creditScore = 900;
        String getLoan = (salary>60000 && creditScore>650)? "Loan approved" : "Loan Denied";
        System.out.println(getLoan);
    }
}
/*
1. Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
* */
