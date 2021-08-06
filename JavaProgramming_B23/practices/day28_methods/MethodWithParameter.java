package day28_methods;

public class MethodWithParameter {
    public static void main(String[] args) {
        eligible(20);

    }

    public static void eligible(int age){
        if (age>21){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }

//        return age;
    }
}
