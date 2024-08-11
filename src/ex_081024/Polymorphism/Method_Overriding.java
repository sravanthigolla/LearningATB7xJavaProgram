package ex_081024.Polymorphism;

class Addition extends Adder{
    public int add(int a, int b) {
        return a*2 + b;
    }


}
public class Method_Overriding {

public static void main(String[] args) {
    Addition add = new Addition();
    System.out.println(add.add(1,2)); //method overriding

    Adder adder = new Adder();
    System.out.println(adder.add(1,2));//calling parent method

    Adder adder2 = new Addition(); //runtime polymorphism-Upcasting
    System.out.println(adder2.add(1,2));


}


}
