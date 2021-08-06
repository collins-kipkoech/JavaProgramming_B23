package day08_ifStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85;

        if(score>= 90 && score<=100){
            System.out.println("Excellent!! you made an A");
        };
        if(score>=80 && score<=89){
            System.out.println("Good job you made a B");
        };
        if(score>=70 && score<=79){
            System.out.println("Good, you made a C");
        };
        if(score>=60 && score<=69){
            System.out.println("you made a D");
        };
        if(score<60){
            System.out.println("Fail");
        }
    }
}
