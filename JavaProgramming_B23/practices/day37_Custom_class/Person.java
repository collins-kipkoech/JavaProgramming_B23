package day37_Custom_class;

public class Person {
    String name;
    int age;
    String city;
    String gender;

    public void eat(){
        System.out.println("person eats");
    }

    public void setInfo(String name,int age,String city,String gender) {
        this.name = name;
        this.age=age;
        this.city=city;
        this.gender=gender;
    }

    public void getInfo() {
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("city="+city);
        System.out.println("gender="+gender);
    }
}
