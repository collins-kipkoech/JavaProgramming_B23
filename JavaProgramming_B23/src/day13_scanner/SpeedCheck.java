package day13_scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter current speed:");
        int currentSpeed = input.nextInt();
        int speedLimit = 55;
        int overSpeedLimit = currentSpeed - speedLimit;
        String message = "";
        if(overSpeedLimit>0){
            message = "You're driving " + overSpeedLimit + " mph over the limit. Slow down!";

        }
        else{
            message = "";
        }
        System.out.println(message);
    }
}
/*
3. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
* */
