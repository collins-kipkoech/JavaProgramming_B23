package day24_Arrays;

public class Grade {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+ " : "+scores[i]);

        }






    }
}
/*
2. given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the gardes of the students in the array named grades
* */
