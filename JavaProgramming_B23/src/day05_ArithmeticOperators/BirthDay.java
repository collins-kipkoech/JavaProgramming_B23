package day05_ArithmeticOperators;

public class BirthDay {

    public static void main(String[] args) {


        String name = "collins",
               birthMonth = "May";
        int birthDay = 5,
            birthYear = 1995;

        System.out.println(name +" was born on " + birthDay + "/" + birthMonth + "/" + birthYear);
        int age = 2021 - birthYear;
        System.out.println(name + " is " + age + " years old");
    }
}
