package day21_loops;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "A1B2C3";
        int sum = 0;

        for (int i = 0; i <= str.length()-1 ; i++) {
            char each = str.charAt(i);
            if(each >= '0' && each <= '9'){
                sum += each - '0';
            }

        }
        System.out.println("sum = " + sum);

    }
}
/*

3. Write a program that can return the sum of digits froma  string
             Ex:
                 input: A1B2C3

                 output:    6
* */
