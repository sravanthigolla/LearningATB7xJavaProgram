package ex_081824.Collections.ArrayList;
//get and set methods in arraylist

import java.util.*;
public class ArrayListex {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Ravi");
        list1.add("Vijay");
        list1.add("sravan");
        list1.add("Nanda");
        System.out.println("Returning Element:"+list1.get(1));
        list1.set(1,"Dates");
        for(String fr:list1)
            System.out.println(fr);
    }
}
