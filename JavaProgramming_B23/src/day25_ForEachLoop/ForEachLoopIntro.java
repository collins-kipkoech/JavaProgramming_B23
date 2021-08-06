package day25_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int each: numbers
             ) {
            System.out.println(each);

        }
        System.out.println("------------------------------------------------------");
//we can use foreach loop if we dont want to use indexes
//        we cannot alter indexes
        String[] names = {"collins","otieno","mercy"};
        for (String each : names
             ) {
            System.out.println(each);
        }




    }
}
