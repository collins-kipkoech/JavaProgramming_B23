package day11_Switch;

public class CommunityCenterSport {

    public static void main(String[] args) {

        String sport = "soccer";

        String fee = (sport=="soccer" || sport=="tennis")? "100" : "50";
        System.out.println(fee);
    }
}
/*
2. Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY
* */
