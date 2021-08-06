package localDateTime_WrapperPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatePractice {
    public static void main(String[] args) {
        String[] names ={"collins","anna","ouko","beryl"};
        LocalDate[] doB={
                LocalDate.of(2020,2,1),
                LocalDate.of(2021,2,2),
                LocalDate.of(2021,2,3),
                LocalDate.of(2021,2,4)


        };
        LocalDate youngest=doB[0];
        int i=0;
        for (LocalDate eachDate : doB) {
            if (eachDate.isAfter(youngest)){
                youngest=eachDate;

            }
            if (eachDate.isLeapYear()){
                System.out.println(eachDate);
            }

        }
        System.out.println(youngest);


        System.out.println("---------------------------------------------------------------------");

        //datetimeformatter method
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-YYYY");
        LocalDate lt=LocalDate.of(2020,4,2);
        System.out.println(lt.format(df));

        //MM displays month in number format e.g 02 - February, 04- April
        //MMM displays month is short text e.g sep,Jan,Dec
        //MMMM displays month in full text, e.g November
        //dd displays day in number
        //YYYY displays year
        //E displays day of the week in short text e.g Tue
        //EE displays day of the week in full text e.g Tuesday

        LocalDate d2 = LocalDate.of(2020,8,23);
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("E,dd/MMMM/YYYY");
        System.out.println(d2.format(df1));

    }
}
