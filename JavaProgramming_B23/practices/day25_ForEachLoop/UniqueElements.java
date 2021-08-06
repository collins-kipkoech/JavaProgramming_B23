package day25_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"java", "java", "python", "c#"};

        for (String word : words) {
//            System.out.println(word);
            int count=0;
            for (String each : words) {
//                System.out.println(each);
                if (word.equals(each)){
                    count++;
                }

            }
            if(count==1){
                System.out.println(word);
            }

        }
    }
}
