package ex_081424.Interface;

public class MI implements Showable1{
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void print() {

        System.out.println("print");

    }

    public static void main(String[] args) {
        MI mi = new MI();
        Showable1 showable1 = new MI();
        mi.show();
        mi.print();
        mi.msg();
        //Printable1.PRICE = 120; not possible as it is final
        System.out.println(Printable1.cube(3));
        System.out.println(Printable1.PRICE);




    }
}
