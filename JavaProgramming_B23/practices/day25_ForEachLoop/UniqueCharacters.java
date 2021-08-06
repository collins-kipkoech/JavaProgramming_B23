package day25_ForEachLoop;

public class UniqueCharacters {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'A', 'C', 'A', 'D', 'D'};

        for (char each : chars) {//loops through the array and returns each element
//            System.out.println(each);
            int count =0;
            for (char character : chars) {//loops through the array and returns each element
                if (character==each){//compares each element in the first loop with every element in the second loop
                    count++;
                }

            }
            if (count==1){//checks if the character is unique, i.e appears only once
                System.out.println(each);
            }

        }
    }
}
