package day27_Recap;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabccddefggggh";

        for (char each: str.toCharArray()
             ) {//each:represents each character of string
            if (str.indexOf(each) == str.lastIndexOf(each)){//if the first and last index number in string
                System.out.println(each);
            }

        }
    }
}
