package day25_ForEachLoop;

public class ReverseElement {

    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#"};
        for (int j = 0; j <=array.length-1 ; j++) { // index numbers of the array
            String element = array[j];
//            System.out.println(element);
            String reverse = "";

            for (int i = element.length()-1; i >=0 ; i--) { // index number of the element
                reverse+=element.charAt(i);

            }
            array[j]= reverse;

        }




    }
}
/*
1. write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"}

	    	output:
	    		["avaJ", "nohtyP", "#C"]
* */
