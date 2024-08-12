package ex_081024.Super;
//super() is provided by the compiler implicitly

class Animal2
{
    Animal2()
    {
        System.out.println("Animal2 constructor");
    }

}
class Dog2 extends Animal2
{
    Dog2()
    {

        System.out.println("Dog2 constructor");
    }


}
public class Compiler1 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}
