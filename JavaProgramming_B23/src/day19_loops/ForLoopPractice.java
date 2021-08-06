package day19_loops;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i=0;i<=100;i++){
            System.out.print(i+" ");
        }

        System.out.println("-----------------------------------------------------");

        for(int i=1;i<=10;i++){
            if(i%2 !=0){
                System.out.print(i+" "); // prints odd numbers
            }
        }
        System.out.println(); // appends a new line

        System.out.println("----------------------------------------");
        for(int i=1;i<=10;i+=2){

            System.out.print(i+" ");

        }
        System.out.println();

        System.out.println("-----------------------------------------------------");
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.print(i+" "); // prints even numbers
            }

        }
        System.out.println();

        System.out.println("-----------------------------------------------------");

        String odds = "";
        String evens = "";
        for (int i = 1; i < 101 ; i++) {
            if(i%2 !=0){
                odds += i+" ";
                //odds = (odds+i)+" ";
            }
            else{
                evens +=i+" ";
            }


        }
        System.out.print("odds: " + odds);
        System.out.println();

        System.out.print("evens: " + evens);
        System.out.println();



    }
}
