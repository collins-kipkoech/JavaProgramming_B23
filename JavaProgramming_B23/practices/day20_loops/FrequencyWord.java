package day20_loops;

public class FrequencyWord {
    public static void main(String[] args) {
        String sentence = "dog cat dog cat dog dog cat";

        int catsCount = 0;
        int dogsCount = 0;

        for (int i = 0; i <= sentence.length()-3 ; i++) {
            String result = sentence.substring(i,i+3);
            if(result.equals("cat")){
                catsCount++;
            }
            if(result.equals("dog")){
                dogsCount++;
            }
            System.out.println("result = " + result);

        }

        System.out.println("dogsCount = " + dogsCount);
        System.out.println("catsCount = " + catsCount);
    }
}
