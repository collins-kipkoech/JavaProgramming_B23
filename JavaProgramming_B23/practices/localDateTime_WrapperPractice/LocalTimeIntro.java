package localDateTime_WrapperPractice;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();//hh/mm/ss/ms
        System.out.println(lt);

        System.out.println("---------------------------------------");
        //hh displays hours
        //mm displays minutes
        //ss displays seconds
        //a diplays am or pm
        DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(lt.format(df));
        System.out.println(lt.plusHours(12).format(df));

        System.out.println("-----------------------------------------------");

        DateTimeFormatter df1=DateTimeFormatter.ofPattern("EEEE, hh:mm:ss a, dd/MMM/YYYY");
//        System.out.println(lt.format(df1));
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt.format(df1));
    }
}
