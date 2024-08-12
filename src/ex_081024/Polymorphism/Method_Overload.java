package ex_081024.Polymorphism;



class Adder
{
    public  int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

public class Method_Overload {
   public static void main(String[] args) {
       Adder adder = new Adder();
       System.out.println(adder.add(1, 2));//polymorphism increases readability
       System.out.println(adder.add(1, 3, 4));
       System.out.println(adder.add(12.23,12.43));

   }

}






