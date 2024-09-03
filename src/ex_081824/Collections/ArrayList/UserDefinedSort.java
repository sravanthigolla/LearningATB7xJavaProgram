package ex_081824.Collections.ArrayList;


import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>
{
    int rollno;
    String name;
    int age;
    Student1(int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
//using different comparisions
//    public int compareTo(Student1 person)
//    {
//        return name.compareTo(person.name);
//    }

//    public int compareTo(Student1 person)
//  {
//      return Integer.compare(rollno,person.rollno);
// }

    public int compareTo(Student1 person)
   {
       return CharSequence.compare(name,person.name);
   }
}
public class UserDefinedSort {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "sonu", 23);
        Student1 s2 = new Student1(102, "Ravi", 25);

        ArrayList<Student1> sl = new ArrayList<Student1>();
        sl.add(s1);
        sl.add(s2);

        Collections.sort(sl);

        for(Student1 s: sl)
        {
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }

    }
}
