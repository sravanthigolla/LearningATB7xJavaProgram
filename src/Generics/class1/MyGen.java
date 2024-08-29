package Generics.class1;


public class MyGen{
    public static void main(String[] args) {

        MyGen1 m = new MyGen1();
        m.add(2);
        System.out.println(m.get());
        m.add("vivek");
        System.out.println(m.get());

    }
}


class MyGen1 <T>{

    T obj;
    void add(T obj)
    {
        this.obj = obj;

    }

    T get()
    {
        return obj;
    }

}
