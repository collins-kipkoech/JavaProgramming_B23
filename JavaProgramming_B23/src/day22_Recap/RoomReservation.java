package day22_Recap;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;
        System.out.println("Welcome to cybertek hotel");
        System.out.println("Would you like to reserve a room?");
        String answer = scan.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Would you like to reserve a room?");
            answer = scan.next().toLowerCase();

        }
        while(answer.equals("yes")){
            System.out.println("Which bed type do you want?");
            String bedType = scan.nextLine().toLowerCase();
            if(bedType.equals("king bed")){
                totalPrice+=120;
            }
            else if(bedType.equals("queen bed")){
                totalPrice+=100;
            }
            else if(bedType.equals("single bed")){
                totalPrice+=80;

            }
            else{
                System.out.println("Invalid room is selected");
            }
            System.out.println("Do you want to reserve another room?");
            answer = scan.nextLine().toLowerCase();

            while (!(answer.equals("yes") && answer.equals("no"))){
                System.out.println("invalid entry,please re-enter");
                System.out.println("Do you want to reserve another room?");
                answer = scan.nextLine().toLowerCase();

            }

        }
        System.out.println("Your total price is: $"+ totalPrice);




    }
}
/*
2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and calculates the
            total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
* */