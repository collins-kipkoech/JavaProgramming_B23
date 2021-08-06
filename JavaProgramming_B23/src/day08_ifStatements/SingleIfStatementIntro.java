package day08_ifStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int score = 50;

        if(score>=60){ // if student passed the exam
            System.out.println("congratulations");
        }
        if(score<60){ // if student failed the exam
            System.out.println("you failed the exam");
        }
    }
}
