package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "collins";
        String lastName = "kipkoech";
        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);
        String gender = "male";

        System.out.println(fullName + " is " + gender);
        int age = 25;
        String companyName = "cubertek";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        int salary = 4500000;
        System.out.println(fullName + " is fulltime? " + isFullTime + " is married? " + isMarried + " salary "+ salary);


        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("salary = " + salary);

    }

}
