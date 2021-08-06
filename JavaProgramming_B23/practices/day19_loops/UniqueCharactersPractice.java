package day19_loops;

public class UniqueCharactersPractice {
    public static void main(String[] args) {
        String word = "aabbcdde";
        String result = "";

        for (int i = 0; i <=word.length()-1 ; i++) {
            char ch = word.charAt(i);
//            System.out.println(ch);
            boolean isUnique = word.indexOf(ch)==word.lastIndexOf(ch);
            if(isUnique){
                result += ch;
            }

        }
        System.out.println("result = " + result);
    }
}
