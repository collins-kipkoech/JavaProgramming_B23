package day34_LocalDateTime_Wrapper;
//import sun.security.rsa.RSAUtil;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate eid = LocalDate.of(2021,7,22);
        System.out.println(eid);

        LocalDate today= LocalDate.now();//prints todays date
        System.out.println(today);


        System.out.println("-------------------------------------------");
        String[] names ={"collins","Alexis","Pheben","Korir"};
        LocalDate[] DoB={LocalDate.of(1990,5,8),
                LocalDate.of(1991,6,9),
                LocalDate.of(1995,8,2),
                LocalDate.of(1999,4,1)};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" birthday is: "+DoB[i]);


            System.out.println("--------------------------------------------");
            LocalDate person1=LocalDate.of(1995,5,5);
            LocalDate person2=LocalDate.of(1996,5,5);


// isBefore() method
            if (person1.isBefore(person2)){
                System.out.println("person1 is older");
            }
            else {
                System.out.println("person2 is older");
            }
// isAfter() method
            if (person1.isAfter(person2)){
                System.out.println("person1 is younger");
            }
            else {
                System.out.println("person2 is younger");
            }

            System.out.println("-------------------------------------------");
            boolean r1= LocalDate.of(2020,1,1).isLeapYear();
            System.out.println(r1);

            System.out.println("-------------------------------------------");

            LocalDate currentDate=LocalDate.now();
            System.out.println(currentDate);

            LocalDate unitAssesment=currentDate.plusDays(10);
            System.out.println(unitAssesment);

            LocalDate unitAssesment4=currentDate.plusMonths(6);
            System.out.println(unitAssesment4);








        }


    }
}
