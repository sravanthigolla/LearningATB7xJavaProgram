package ex_081824.Collections;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List mylist = new ArrayList(); //dynamic dispatch

        //Collection - Interface
        //Collections - class

        List arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.contains(4));

        List shopping_list = List.of("Milk", "Bread", "Tea"); //of is a static function in List which can be directly used in interface

        System.out.println(shopping_list);
        System.out.println(shopping_list.size());
        //shopping_list.add("Banana"); This is not possible as it is not static it is incomplete function is interface




        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("sravan");
        //list.add(123); cannot add int as it is defined as string

        mylist.add("Ravi");
        mylist.add("Vijay");
        mylist.add("Vijay"); //Duplicate values are allowed in list
        mylist.add("sravan");
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);
        mylist.remove("Vijay");//removes the first occurance of the specified element from the list
        System.out.println(mylist);
        //mylist.clear(); //clear the list
        //System.out.println(mylist);
        System.out.println(mylist);
        System.out.println("Print mylist");
        //to print arraylist which has data of different data types
        for(Object o : mylist) {
            System.out.println(o);
        }

        System.out.println("Print list -1");
        //To get list of all functions in console give javap java.util.ArrayList;
        for(int i = 0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("Print list -2");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Print list -3");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);


    }
}
