package ex_081724.InnerClass;
//A static class was created within the class.
//A static class is a class that is created inside a class, is called a static nested class in Java. It cannot access non-static data members and methods. It can be accessed by outer class name.
//It can access static data members of the outer class, including private.
public class StaticNestedClass {
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }

    public static void main(String[] args) {
        StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
        obj.msg();


    }
}
