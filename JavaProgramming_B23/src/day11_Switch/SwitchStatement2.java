package day11_Switch;

public class SwitchStatement2 {

    public static void main(String[] args) {

        String name = "chrme";

        switch (name){
            case "chrome":
                System.out.println("Chrome browser is selected");
                break;
            case "firefox":
                System.out.println("Firefox browser is selected");
                break;
            default:
                System.err.println("Invalid browser");
        }
    }
}
