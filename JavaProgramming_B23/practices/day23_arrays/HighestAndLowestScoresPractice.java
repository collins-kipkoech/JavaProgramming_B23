package day23_arrays;

public class HighestAndLowestScoresPractice {

    public static void main(String[] args) {

        int[] scores ={95,70,95,90,100};
        String[] names = {"Mike","Adam","Tonny","John","Ammy"};

        int maxScore = scores[0];
        int minScore = scores[0];
        String maxName = "";
        String minName = "";

        for (int i = 0; i < scores.length; i++) {
            int result = scores[i];
            if (result>maxScore){
                maxScore=result;
                maxName=names[i];
            }
            if (result<minScore){
                minScore=result;
                minName=names[i];
            }

        }
        System.out.println(maxName + " : "+maxScore);
        System.out.println(minName + " : "+minScore);
    }
}
