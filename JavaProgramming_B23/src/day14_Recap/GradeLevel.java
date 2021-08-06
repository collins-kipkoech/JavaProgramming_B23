package day14_Recap;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade number:");
        byte grade = scan.nextByte();
        String gradeLevel = "";

        if(grade>=1 && grade<=18){
            if(grade<=5){
                gradeLevel = "Elementary school";
            }
            else if(grade<=8){
                gradeLevel = "Middle school";
            }
            else if(grade<=12){
                gradeLevel = "High school";
            }
            else if(grade<=16){
                gradeLevel = "College";
            }
            else{
                gradeLevel = "Grad School";
            }

        }
        else{ //if grade is invalid
            gradeLevel = "Invalid grade level given";
        }
        System.out.println("gradeLevel = " + gradeLevel);


        scan.close();
    }
}
/*
     Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given

* */
