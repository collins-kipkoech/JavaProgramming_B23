package day17_String;

import java.util.Scanner;

public class FirstAndLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        String firstchar = word.substring(0,1);
        String lastChar = word.substring(word.length()-1);

        if(firstchar.equalsIgnoreCase(lastChar)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        scan.close();

    }
}
