package day23_arrays;

public class RemoveDuplicatePractice {

    public static void main(String[] args) {

        String word = "aabccuuddtejjjjjjdei";
        String removeDup = "";

        for (int i = 0; i < word.length() ; i++) {
            char each = word.charAt(i);
            if (removeDup.contains(""+each)){
                continue;
            }
            removeDup+=each;

        }
        System.out.println("removeDup = " + removeDup);

        System.out.println("----------------------------------------------------------");




    }
}
