package day28_CustomMethods;

public class VoidMethodPractice {

    public static void main(String[] args) {
        printOddNumbers(10,100);
        printEvenNumbers(10,100);
        calculateAge(1980);
        eligibleToVote(25,true);
        calculate(2,4,'*');


    }
    public static void printOddNumbers(int from,int to){
        for (int i =from; i <=to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }

            
        }
        System.out.println();
        
    }

    public  static void printEvenNumbers(int from,int to){
        for (int i = from; i <=to ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void calculateAge(int birthYear){
        System.out.println("Your age is: "+(2021-birthYear) );
    }

    public static void eligibleToVote(int age,boolean isUsCitizen){
        if (age>=21 && isUsCitizen){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void calculate(int num1,int num2,char operator){
        switch (operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("Division: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }

    }
}
