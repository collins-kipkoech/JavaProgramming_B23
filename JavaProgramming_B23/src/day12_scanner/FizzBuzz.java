package day12_scanner;

public class FizzBuzz {

    public static void main(String[] args) {

       int number = 5;
       switch (number){
           case 3:
           case 6:
           case 9:
               System.out.println("Fizz");
               break;
           case 1:
               System.out.println("1");
               break;
           case 2:
               System.out.println("2");
               break;

           case 4:
               System.out.println("4");
               break;


           case 7:
               System.out.println("7");
               break;
           case 8:
               System.out.println("8");
               break;
           case 5:
           case 10:
               System.out.println("Buzz");
           default:
               System.out.println("Invalid");
       }


    }
}
/*
2. write a program that can print any number between 1 ~ 10,
but for number which is a multiple of 3 print "Fizz" instead
of the number and for number which is a multiple of 5, print "Buzz"
instead of the number, and for number which is a multiple of both 3 and
5 both print "FizBuzz" instead of the number.

                  MUST use switch statement
* */
