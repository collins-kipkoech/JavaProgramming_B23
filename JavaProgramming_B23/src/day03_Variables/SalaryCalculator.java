package day03_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        byte hourlyRate = 50;
        byte weeklyHours = 40;
        byte numberOfWeeksInAYear = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeksInAYear;
        System.out.println(salary);
    }
}
