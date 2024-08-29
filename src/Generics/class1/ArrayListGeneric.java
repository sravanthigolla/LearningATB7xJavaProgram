package Generics.class1;
import java.util.*;

public class ArrayListGeneric {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();//without generics
        //with generics
        //ArrayList<Integer> list=new ArrayList<Integer>();
        list.add("rahul");
        list.add("jai");
        list.add("32");//compile time error with generics

        String s= (String)list.get(1);//type casting is not required
        System.out.println("element is: "+s);

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
