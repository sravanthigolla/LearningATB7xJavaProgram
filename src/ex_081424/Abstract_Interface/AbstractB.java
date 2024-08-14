package ex_081424.Abstract_Interface;

//The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.
abstract class AbstractB implements InterfaceA{

    public void b()
    {
        System.out.println("I am B");
    }

    final void nonAbstractB()
    {
        System.out.println("Abstract B");
    }

    static void nonabstractstatic()
    {
        System.out.println("onabstractstatic");
    }
}
