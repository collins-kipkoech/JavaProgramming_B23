package day04_Variables;

public class TaxCalculations {

    public static void main(String[] args) {

        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;

        System.out.println("your salary is $" + salary);
        System.out.println("you need to pay $" + totalStateTax + " to the state tax");
        System.out.println("you need to pay $" + totalFederalTax + " to the federal tax");

    }
}
