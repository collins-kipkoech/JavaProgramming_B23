package day20_loops;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i <= 5 ; i++) {
            if(i==3){
                break;
            }
            System.out.println(i);

        }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i <= 5 ; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);

        }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 11 ; i++) {
            if(i%2==0){ // if i is even number
                continue;
            }
            System.out.println(i);

        }

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i <= 100 ; i++) {
            if(i%15 != 0 ){
                continue;

            }
            System.out.print(i+" ");

        }
        System.out.println();


        System.out.println("----------------------------------------------------------");

        for (char i = 'A'; i <= 'Z' ; i++) {
            if(i=='D' || i=='T' || i=='X'){
                continue;
            }
            System.out.print(i+" ");
            
        }
        System.out.println();


    }
}
