package day20_loops;

public class CatsAndDogs {
    public static void main(String[] args) {
        String sentence = "cat dog dog cat";
        int numberOfCats = 0;
        int numbersOfDogs = 0;

        for (int i = 0; i <= sentence.length()-3 ; i++) {
            String each = sentence.substring(i,i+3);
            System.out.println(each);
            if(each.equals("cat")){
                numberOfCats++;
            }
            if(each.equals("dog")){
                numbersOfDogs++;
            }

        }
        System.out.println("numbersOfDogs = " + numbersOfDogs);
        System.out.println("numberOfCats = " + numberOfCats);

    }
}
