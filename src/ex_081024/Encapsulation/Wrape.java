package ex_081024.Encapsulation;
//Encapsulation in Java is a process of wrapping code and data together into a single unit

//We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

//By providing only a setter or getter method, you can make the class read-only or write-only.

//It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
public class Wrape {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sravanthi");
        System.out.println(student.getName());
    }
}
