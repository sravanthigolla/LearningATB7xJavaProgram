package ex_081424.Interface;

public interface Printable1 {
    void print();



    static final double PRICE=432.78; //constant

    default void msg() {
        System.out.println("msg");
        method1();
    }

    static int cube(int n) {
        return n * n * n;
    }

    private void method1()
    {
        System.out.println("method1");
    }


}


