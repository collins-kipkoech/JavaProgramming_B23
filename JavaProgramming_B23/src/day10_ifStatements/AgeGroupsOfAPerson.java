package day10_ifStatements;

public class AgeGroupsOfAPerson {

    public static void main(String[] args) {

        int age = 2;

        if(age>=85){
            System.out.println("Old senior citizen");
        }
        else if(age>=75){
            System.out.println("Senior citizen");
        }
        else if(age>=65){
            System.out.println("Young senior citizen");
        }
        else if(age>=55){
            System.out.println("Very young Senior citizen");
        }
        else if(age>=50){
            System.out.println("Middle-aged adult");
        }
        else if(age>=40){
            System.out.println("Young Middle-Aged Adult");
        }
        else if(age>=21){
            System.out.println("Adult");
        }
        else if(age>=18){
            System.out.println("Young adult");
        }
        else if(age>=13){
            System.out.println("Teenager");
        }
        else if(age>=10){
            System.out.println("Pre-teen");
        }
        else if(age>=6){
            System.out.println("Kid");
        }
        else if(age>=3){
            System.out.println("Toddler");
        }
        else{
            System.out.println("infant");
        }



    }
}
/*
write a program that can define the age groups of a person
                 age groups are:
                        infant ( < 3 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

* */
