package ex_081424.Interface;

public class MultipleInheritance1 implements Showable,Printable {
    @Override
    public void print() {
        System.out.println("father");
    }

    @Override
    public void show() {
        System.out.println("mother");
    }

    @Override
    public void common() {
   System.out.println("common");
    }

    public static void main(String[] args) {
        MultipleInheritance1 obj = new MultipleInheritance1();
        obj.show();
        obj.print();
        obj.common();
    }
}
