package day10_ifStatements;

public class Ternary_Practice2 {

    public static void main(String[] args) {
        int num = -2;

        String result = (num>0)? "Positive" :(num<0)? "Negative" : "Zero";
        System.out.println("result = " + result);

        System.out.println("---------------------------------------------");
        int score = 70;

        char grade = (score>=90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)? 'D' : 'F';
        System.out.println("grade = " + grade);

    }
}
