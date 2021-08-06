package day24_Arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {
        String[] classmates = {"Gulistan","Fruza","Ahmet","memet","Muhter","Tamara","Abbos",
                "Shirin","Robinson","Shirin"};

        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i <=classmates.length-1 ; i++) {//to loop through the elements in an array
            System.out.println(classmates[i].substring(0,3));// prints the first three characters in every element in the array

        }


    }
}
/*
1. create string array, and store the names of your  class mates (10)
            print the first three characters of each name

* */
