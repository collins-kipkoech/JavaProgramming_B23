package day10_ifStatements;

public class CampusTime2 {

    public static void main(String[] args) {
        int campusTime = 2;
        String message = "";
        if(campusTime>=1 && campusTime<=24){
            if(campusTime>=8 && campusTime<=23){
                message = "open";
            }
            else{
                message = "closed";
            }

        }
        else{
            message = "Invalid time";
        }
        System.out.println("message = " + message);

    }
}
/*
    3. Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
            Campus is open from 8 am(8) to 11 pm (23)
            If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
            If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”
* */
