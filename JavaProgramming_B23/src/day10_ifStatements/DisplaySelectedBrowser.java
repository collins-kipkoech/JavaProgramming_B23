package day10_ifStatements;

public class DisplaySelectedBrowser {

    public static void main(String[] args) {

        String browserName = "opera";

        if(browserName=="chrome"){
            System.out.println(browserName + " Browser is selected");
        }
        else if(browserName=="firefox"){
            System.out.println(browserName + " Browser is selected");
        }
        else if(browserName=="opera"){
            System.out.println(browserName + " Browser is selected");
        }
        else{
            System.out.println(browserName + " Browser is selected");
        }


    }
}
/*
1. write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, output should be: Invalid Browser Name

             Ex:
                browserName = "chrome";

                output:
                    Chrome Browser is Selected
* */
