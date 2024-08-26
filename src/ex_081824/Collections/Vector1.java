package ex_081824.Collections;

import java.util.Vector;

public class Vector1 {

    public static void main(String[] args) {


    Vector v = new Vector();
     v.add("Pramod");
     v.add("Prasad");
     v.add("Kiran");

     System.out.println(v);
//same as ArrayList. only problem with vector is it is thread safe, synchronised. It will be time consuming. It is legacy(old) class.
    }
}
