package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 90;

        if(score>=90 && score<=100){
            System.out.println("Grade is A");
        }
        else if(score>=80){
            System.out.println("Grade is B");
        }
        else if(score>=70){
            System.out.println("Grade is C");
        }
        else if(score>=60){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
