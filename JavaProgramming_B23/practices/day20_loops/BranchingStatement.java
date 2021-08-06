package day20_loops;

public class BranchingStatement {
    public static void main(String[] args) {
        for(char i ='A'; i<='Z';i++){
            if(i=='D' || i=='M'){
                continue;
            }
            System.out.print(i);
        }

    }
}
