package ex_081724.Wrapper;
//The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing
public class Autoboxing {

    public static void main(String[] args) {
     int a = 20;
     Integer i = Integer.valueOf(a);//converting int to Integer
        Integer j = a;
        System.out.println("a:"+a+" "+"i:"+i+" "+"j:"+j);

    }
}
