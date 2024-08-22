package ex_081724.InnerClass;

//An interface created within class or interface.
//An interface, i.e., declared within another interface or class, is known as a nested interface.
//The nested interface must be referred to by the outer interface or class. It can't be accessed directly.
//The nested interface must be public if it is declared inside the interface, but it can have any access modifier if declared within the class.
//Nested interfaces are declared static
interface Showable{
    void show();
    interface Message{
        void msg();
    }
}
public class NestedInterface implements Showable.Message {
    public void msg()
    {
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args) {

        Showable.Message message = new NestedInterface();//upcasting
        message.msg();
    }

}
