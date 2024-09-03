package ex_081824.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student2  {
    int rollno;
    String name;
    int age;

    Student2(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class SortByName implements Comparator<Student2>{
    public int compare(Student2 o1, Student2 o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortById implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return Integer.compare(o1.getRollno(), o2.getRollno());
    }
}

class SortByDesc implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return Integer.compare(o2.getRollno(), o1.getRollno());
    }
}

public class UserDefinedMultiSort {

    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "sonu", 23);
        Student2 s2 = new Student2(102, "Ravi", 25);

        ArrayList<Student2> sl = new ArrayList<Student2>();
        sl.add(s1);
        sl.add(s2);
        System.out.println(sl);
        Collections.sort(sl, new SortById());
        System.out.println(sl);


//        for(Student2 s: sl)
//        {
//            System.out.println(s.rollno+" "+s.name+" "+s.age);
//        }

        Collections.sort(sl, new SortByName());
         System.out.println(sl);

         Collections.sort(sl, new SortByDesc());
        System.out.println(sl);
    }


}
