package day20_loops;

public class FrequencyWord2 {
    public static void main(String[] args) {
        String sentence = "java java java java java java lava lava lava lava";
        int javacount = 0;
        int lavaCount = 0;


        for (int i = 0; i <= sentence.length()-4 ; i++) {
            String result = sentence.substring(i,i+4);
            if(result.equals("java")){
                javacount++;
            }
            if(result.equals("lava")){
                lavaCount++;
            }
            System.out.println(result+" ");

        }
        System.out.println("count = " + javacount);
        System.out.println("lavaCount = " + lavaCount);
    }
}
