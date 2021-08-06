package localDateTime_WrapperPractice;

import java.time.LocalDate;

public class LocalDateIntroPractice {
    public static void main(String[] args) {
        //LocalDate represents date(year,month,day(yyyy-mm-dd))
        LocalDate myDate = LocalDate.now();//displays the current date
        System.out.println(myDate);

        LocalDate my_date=LocalDate.of(2020,04,10);
        System.out.println(my_date);

        System.out.println("----------------------------------------------------------------");

        String[] names={"collins","mercy","anna","ouko"};
        LocalDate[] doB={
                LocalDate.of(2020,04,5),
                LocalDate.of(2021,06,18),
                LocalDate.of(1995,10,25),
                LocalDate.of(2000,2,19)
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" : "+doB[i]);

        }

        System.out.println("---------------------------------------------------------");
        //isBefore() method in LocalDate checks if this date is before the specified date
        // Return Value: The function returns true if this date is before the specified date.
        LocalDate person1=LocalDate.of(2020,10,20);//older
        LocalDate person2 =LocalDate.of(2020,10,25);//younger
        if (person1.isBefore(person2)){
            System.out.println("person1 is older");
        }
        else{
            System.out.println("person2 is older");
        }

        //isAfter() method in LocalDate checks if this date is after the specified date
        // Return Value: The function returns true if this date is after the specified date.

        LocalDate p1=LocalDate.of(2021,4,2);
        LocalDate p2=LocalDate.of(2021,4,1);
        if (p1.isAfter(p2)){
            System.out.println("p1 is younger");
        }
        else{
            System.out.println("p2 is younger");
        }

        System.out.println("----------------------------------------------------------");
        //isLeapYear() method returns true if the date year provided is a leap year
        //plusDays() method adds days to the provided date
        //plusWeeks() methods adds weeks to the provided date
        //plusMonths() method adds months to the provided date

        LocalDate d1 = LocalDate.now();

        System.out.println(d1.plusDays(5));
        System.out.println(d1.plusWeeks(2));
        System.out.println(d1.plusMonths(2));
        System.out.println(d1.plusYears(4));





    }
}
