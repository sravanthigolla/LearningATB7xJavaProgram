package ex_081424.Abstract_Interface;

public class Runner {

    public static void main(String[] args) {
        InterfaceA i = new ClassC();
        i.a();
        i.b();
        i.c();
        AbstractB b = new ClassC();
        b.nonAbstractB();
        AbstractB.nonabstractstatic();//static method does not require object


    }
}
