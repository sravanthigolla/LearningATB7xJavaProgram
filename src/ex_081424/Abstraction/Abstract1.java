package ex_081424.Abstraction;
//abstract class can have abstract methods(without body) and non abstract methods(with body)
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//Another way, it shows only essential things to the user and hides the internal details,
//It needs to be extended and its method implemented. It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.
abstract class Abstract1 {
    Abstract1()//constructor
    {
        System.out.println("Abstract1");
    }
    abstract void run();
    void nonabstract()//nonabstract method
    {
        System.out.println("nonabstract");
    }
}
