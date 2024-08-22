package ex_081724.Static;
//The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.
//The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
//The static variable gets memory only once in the class area at the time of class loading.

class student {
    int rollno;
    String name;
    static String college = "Vikas";

//Constructor
student(int r, String n)
{
    this.rollno = r;
    this.name = n;
}

void display()
{
    System.out.println("roll no is "+rollno);
    System.out.println("name is "+name);
    System.out.println("College is "+college);
}
}
public class Variable {
    public static void main(String[] args) {
        student s1 = new student(122, "sravan");
        student s2 = new student(123, "Nainika");

        s1.display();
        s2.display();
    }



}
