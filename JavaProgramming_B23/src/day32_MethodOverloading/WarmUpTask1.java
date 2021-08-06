package day32_MethodOverloading;

public class WarmUpTask1 {

    public static int sumOf2Numbers(int a,int b){
        return a+b;
    }

    public static int sumOf3Numbers(int a,int b,int c){
        return a+b+c;
    }

    public static int sumOf4Numbers(int a,int b,int c,int d){
        return a+b+c+d;
    }

//    -----------------------method overloading---------------------------------
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static double sum(double a, double b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static double sum(double a,double b,double c,double d){
        return a+b+c+d;
    }

}
/*
Task1:
    1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers

    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers

    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers

* */
