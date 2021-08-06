package day12_scanner;

import java.util.Scanner;

public class NumberOfMonths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month:");
        int month = input.nextInt();
        String message = "";

        if(month==1){
            message = "January";
        }
        else if(month==2){
            message = "February";
        }
        else if(month==3){
            message = "March";
        }
        else if(month==4){
            message = "April";
        }
        else if(month==5){
            message = "May";
        }
        else if(month==6){
            message = "June";
        }
        else if(month==7){
            message = "July";
        }
        else if(month==8){
            message = "August";
        }
        else if(month==9){
            message = "September";
        }
        else if(month==10){
            message = "October";
        }
        else if(month==2){
            message = "November";
        }
        else if(month==12){
            message = "December";
        }
        else{
            message = "Invalid month";
        }

        System.out.println("message = " + message);
    }
}
