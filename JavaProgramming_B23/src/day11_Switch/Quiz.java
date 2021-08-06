package day11_Switch;

public class Quiz {
    public static void main(String[] args) {
        int age = 40;
        String ageGroup = "";

        if(age>0 && age<=150){
            if(age<21){
                ageGroup = "Teenager";
            }
            else if(age>=21 && age <55 ){
                ageGroup = "Adult";
            }
            else{
                ageGroup = "Senoir";
            }

        }
        else{
            ageGroup = "Invalid";
        }
        System.out.println("ageGroup = " + ageGroup);

    }
}
/*
5. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

                  NOTE: MUST APPLY NESTED IF
* */
