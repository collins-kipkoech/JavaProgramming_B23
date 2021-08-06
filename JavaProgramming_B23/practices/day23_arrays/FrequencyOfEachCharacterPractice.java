package day23_arrays;

public class FrequencyOfEachCharacterPractice {
    public static void main(String[] args) {
        String str = "aabcccdcccccccccccc";
        String removeDup="";

        for (int i = 0; i < str.length(); i++) {//loops through the elements of the string
            char ch = str.charAt(i);//get each element in the string and assing to char ch
            if (!removeDup.contains(""+ch)){//checks if removedup variable does not contain the character
                removeDup+=ch;

            }

        }
        System.out.println("removeDup = " + removeDup);
        String result="";//store the character and its frequency

        for (int j = 0; j < removeDup.length(); j++) {//loops through the elements of the removedup variable
            char each = removeDup.charAt(j);//gets each character from removedup and assigns to each varible character
            int frequency=0;
            for (int i = 0; i < str.length(); i++) {//loops through the str string to get each element
                char ch=str.charAt(i);//gets each element in the str string
                if (each==ch){//checks if the element in removedup is equal to element in str
                    frequency++;
                }

            }
            result+=""+each+frequency+" ";

        }

        System.out.println(result);




    }
}
