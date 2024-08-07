package ex_080424;

import java.lang.reflect.Constructor;

public class Consuctorcall {
    public static void main(String[] args) {
       Consuctor call = new Consuctor();
       Consuctor call2 = new Consuctor("Sravanthi");
       Consuctor call3 = new Consuctor("Sravanthi", 900090707);
        Consuctor call4 = new Consuctor(900090707);
        System.out.println(call.name);
        System.out.println(call.phone);
        System.out.println(call2.name);
        System.out.println(call2.phone);
        System.out.println(call3.name);
        System.out.println(call3.phone);
        System.out.println(call4.name);
        System.out.println(call4.phone);
        call.printdetails();
        call2.printdetails();
        call3.printdetails();
        call4.printdetails();

    }
}
