package day37_Custom_class;

public class Rectangle {
    double length;
    double width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public void getInfo(){
        System.out.println("Width= "+width);
        System.out.println("Length= "+length);
        System.out.println("Area= "+calculateArea());
        System.out.println("Perimeter= "+calculatePerimeter());
    }
}
