package day04_Variables;

public class PhoneNumber {

    public static void main(String[] args) {

        String countryCode = "+254";
        int areaCode = 700;
        int localNumber = 111111;

        System.out.println(countryCode + "(" + areaCode + ")-" + localNumber);
    }
}
/*
2. create a class named Phone Number and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = +1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
* */
