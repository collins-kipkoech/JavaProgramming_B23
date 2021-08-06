package day08_ifStatements;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 100;

        boolean madeA = score>=90 && score<=100;
        boolean madeB = !madeA && score>=80;
        boolean madeC = !madeB && score>=70;
    }
}
