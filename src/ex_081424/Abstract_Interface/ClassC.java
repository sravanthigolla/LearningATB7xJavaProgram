package ex_081424.Abstract_Interface;

public class ClassC extends AbstractB{
    @Override
    public void a() {
        System.out.println("I am a");
    }

    @Override
    public void c() {
   System.out.println("I am c");
    }

    //void nonAbstractB() - as it is final it cannot be overwritten

}
