package day19_loops;

public class Remove_Duplicate_Practice {
    public static void main(String[] args) {
        String word = "aaaaabbbbbbbbcccccchhhhhhhhhhhdt";
        String result = "";

        for (int i = 0; i <=word.length()-1 ; i++) {
            if(!(result.contains(""+word.charAt(i)))){
                result += word.charAt(i);

            }

        }
        System.out.println("result = " + result);
    }
}
