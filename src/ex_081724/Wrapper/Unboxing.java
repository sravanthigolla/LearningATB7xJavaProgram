package ex_081724.Wrapper;

public class Unboxing {

    public static void main(String[] args) {
        Integer a = new Integer(3);
        int i = a.intValue();//convert Integer to int explicitly
        int j = a;//unboxing

        System.out.println("a:"+a+" "+"i:"+i+" "+"j:"+j);
    }
}
