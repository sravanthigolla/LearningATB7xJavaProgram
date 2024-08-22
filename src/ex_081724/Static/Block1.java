package ex_081724.Static;

public class Block1 {
//static block is executed before the main method at the time of classloading.
    static {
        System.out.println("static block is invoked");
    }

    public static void main(String args[]) {
        System.out.println("Hello main");
    }
}