package ex_072124;

public class Userdefined_func {
    public static void main(String[] args) {
        //userdefined function- Block of code which we can reuse
        //define
        // call function

        greet();
        System.out.println("_______________");
        String name = greet1();
        System.out.println(name);
        System.out.println("_______________");
        greet2("Sravan");
        System.out.println("_______________");
        int sum = greet3(3,5);
        System.out.println(sum);
        System.out.println("_______________");

    }
// without arguments and no return type
    static void greet()
    {
        System.out.println("without arguments and no return type");
        System.out.println("Hello World");
    }

    // without arguments and with return type

    static String greet1()
    {
        System.out.println("without arguments and with return type");
        return "Hello World";
    }

    // with arguments and without return type
    static void greet2(String name1)
    {
        System.out.println("with arguments and without return type");
        System.out.println(name1);
    }

    //with arguments and with return type
    static int greet3(int a, int b)
    {
        System.out.println("with arguments and with return type");
        return a + b;
    }
}
