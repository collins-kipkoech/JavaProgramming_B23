package day21_loops;

import java.util.Scanner;

public class RoomReservationPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to cybertek hotel");
        int totalPrice = 0;

        System.out.println("Would you like to reserve a room?");
        String answer = scan.next();
        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Would you like to reserve a room?");
            answer = scan.next();

        }
        while (answer.equals("yes")){
            System.out.println("Welcome to our rooms");
            System.out.println("Please enter the bed type");
            scan.nextLine();
            String bedType = scan.nextLine();
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
                System.out.println("Invalid input");
            }

            System.out.println("Do you want to reserve another room");
            answer = scan.next();


            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid input, please re-enter Would you like to reserve a room?");
                answer = scan.next();

            }
        }


        System.out.println("totalPrice = " + totalPrice);



    }
}
/*
2. write a program for the room reservation:
           1. King Bed ==> 120$
           2. Queen Bed ==> 100$
           3.  single Bed ==> 80$
    the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
        do you want to reserve another room:
                    if yes ==> repeat the previous steps
                    otherwise return the  total price
 */
