package day25_ForEachLoop;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#", "Cybertek", "School", "Selenium", "API"};

        for (int i = 0; i < array.length; i++) {//loops through the elements in the array
            String element = array[i];//assigns each element in the array to the element variable
            String reverse="";
            for (int j = element.length()-1; j >=0 ; j--) {//loops through characters in each element
                reverse+=element.charAt(j);//concates each character to the reverse variable

            }
            array[i]=reverse;

        }
        System.out.println(Arrays.toString(array));

    }
}
