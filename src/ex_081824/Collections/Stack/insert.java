package ex_081824.Collections.Stack;

import java.util.Iterator;
import java.util.Stack;

//The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack.
// The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(),
//boolean pop
public class insert {

    public static void main(String[] args) {
        Stack<String> S = new Stack<String>();
        S.push("Ayush");
        S.push("Ayush");
        S.push("Garvit");
        S.push("Amit");
        S.push("Ashish");
        S.push("Garima");
        System.out.println(S.pop());//LIFO-Last In First Out
        System.out.println(S.peek());//Top element

        Iterator<String> itr  = S.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
