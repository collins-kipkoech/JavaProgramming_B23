package day30_Recap;

public class LoopsReview {
    public static void main(String[] args) {
        for (int i = 0; i < 11 ; i++) {
            System.out.println(i);

        }
        System.out.println("-------------------------------------");
        String str = "java";
        for (int i = 0; i <4 ; i++) {
            System.out.println(str.charAt(i));

        }

        System.out.println("-------------------------------------");
        for (int i = 1, ch=65; i <=26 ; i++, ch++) {
            System.out.println(i+" "+(char)ch);

        }
    }
}
