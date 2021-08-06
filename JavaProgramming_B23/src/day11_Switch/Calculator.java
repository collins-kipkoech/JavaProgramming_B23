package day11_Switch;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 100;
        double n2 = 2.5;
        char mathoperator = '-';
        double result = 0;

        switch(mathoperator){
            case '-':
                result=n1-n2;
                break;
            case '+':
                result=n1+n2;
                break;
            case '*':
                result=n1*n2;
                break;
            case '/':
                result=n1/n2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("result = " + result);
    }
}
