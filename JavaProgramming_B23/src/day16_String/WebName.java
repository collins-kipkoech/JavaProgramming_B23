package day16_String;

public class WebName {
    public static void main(String[] args) {
        String url = "www.google.com";
        String name = url.substring(url.indexOf(".")+1,url.lastIndexOf("."));
        String domain = url.substring(url.lastIndexOf(".")+1);
        System.out.println(name);
        System.out.println(domain);


    }
}
