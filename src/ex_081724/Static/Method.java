package ex_081724.Static;
//If you apply static keyword with any method, it is known as static method.

 //       A static method belongs to the class rather than the object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it.

//There are two main restrictions for the static method. They are:

//The static method can not use non static data member or call non-static method directly.
 //       this and super cannot be used in static context.

class Student1{
    int rollno;
    String name;
    static String college = "ITS";

    static void change()
    {
        college = "VIKAS";
        //rollno = 9; non static data member cannot be used in static method
    }

    static int cube(int x){
        return x*x*x;
    }

    Student1(int r, String n)
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
    public class Method {

        public static void main(String[] args) {
            Student1.change();
            Student1 s1 = new Student1(124, "pushkal");
            Student1 s2 = new Student1(432,"Nanda");

            s1.display();
            s2.display();

            int result = Student1.cube(5);
            System.out.println(result);

        }

}
