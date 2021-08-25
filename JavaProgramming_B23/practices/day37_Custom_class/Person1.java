package day37_Custom_class;

public class Person1 {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="collins";
        person1.age=20;
        person1.city="Nairobi";
        person1.gender="male";

        System.out.println(person1.name);

        System.out.println("==========================================================================");

        Person person2=new Person();
        person2.setInfo("collo",24,"Kenya","male");
        
    }
}
