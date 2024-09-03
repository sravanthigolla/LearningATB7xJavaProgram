package ex_081824.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class UserDefined {

    public static void main(String[] args) {
        Student s1 = new Student(101,"sonu", 23);
        Student s2 = new Student(102,"Ravi", 25);

        ArrayList<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);

        Iterator itr = sl.iterator();

        while(itr.hasNext())
        {
            Student st = (Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
