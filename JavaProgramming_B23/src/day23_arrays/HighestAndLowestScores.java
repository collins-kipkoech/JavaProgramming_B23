package day23_arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] scores ={95,70,95,90,100};
        String[] names = {"Mike","Adam","Tonny","John","Ammy"};

        int maxScores = scores[0];
        int minScores = scores[0];
        String maxName = "";
        String minName = "";
        for (int i = 0; i <=scores.length-1 ; i++) {
            int each = scores[i];
            String eachName = names[i];
            if(each>maxScores){
                maxScores=each;
                maxName = eachName;
            }
            if(each<minScores){
                minScores = each;
                minName = eachName;

            }

        }
        System.out.println(maxName +" : "+ maxScores);

        System.out.println(minName+" : " + minScores);



    }
}
