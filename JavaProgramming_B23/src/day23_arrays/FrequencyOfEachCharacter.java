package day23_arrays;

public class FrequencyOfEachCharacter {

    public static void main(String[] args) {
        String str = "aabcccd";
//        String result = "";
        String removeDup = "";
        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch = str.charAt(i);
            if(removeDup.contains(""+ch)){
                continue;
            }
            removeDup+=ch;


        }
        System.out.println(removeDup);





    }
}
