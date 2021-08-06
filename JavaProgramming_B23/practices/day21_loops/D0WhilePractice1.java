package day21_loops;

public class D0WhilePractice1 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int i=0;

        do {
            if (i%2==0){
                even++;
            }
            else{
                odd++;
            }
            i++;

        }while (i<10);
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);



    }


}
