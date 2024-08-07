package ex_080424.HierrachialInheritance;

public class Runner {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.BHK3();
        c1.BHK2();

        c2.BHK2();
        //c2.BHK1();
    }
}
