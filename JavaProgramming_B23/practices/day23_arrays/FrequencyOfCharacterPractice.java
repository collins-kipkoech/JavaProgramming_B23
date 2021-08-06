package day23_arrays;

public class FrequencyOfCharacterPractice {
    public static void main(String[] args) {
        String str = "aabcccdcccccccccccc";

        char ch='c';
        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                frequency++;
            }

        }
        System.out.println("frequency = " + frequency);
    }
}
