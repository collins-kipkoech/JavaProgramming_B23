package day35_arrayList;

import java.util.ArrayList;

public class ArrayListIntroPractice {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //add() method adds elements into the arraylist
        //add() method can also take index to add an element into a specified index
        list.add("collins");
        list.add("kipkoech");
        list.add(1,"cheruyot");
        System.out.println(list);

        System.out.println("---------------------------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
        //get() methods returns an element at a specified index in the arraylist
        System.out.println(numbers.get(2));

        System.out.println("------------------------------------------------------------------");

        //size() method returns the total number of elements in an arraylist
        System.out.println(list.size());
        System.out.println(numbers.size());

        System.out.println("--------------------------------------------------------------------");

        //set() method replaces the old element with a new element in a specified index
        list.set(1,"collo");
        System.out.println(list);
        numbers.set(0,2);
        System.out.println(numbers);

        System.out.println("------------------------------------------------------------------------");
        //remove(index) method removes an element at a specified index
        //remove(object) method removes the first matching object
        list.remove(0);
        System.out.println(list);
        numbers.remove(2);
        System.out.println(numbers);

        System.out.println("---------------------------------------------------------------------");


    }
}
