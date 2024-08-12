package ex_081024.Super;
//super is used to invoke parent class constructor.
class Animal1
{
    Animal1()
    {
        System.out.println("Animal1 constructor");
    }

}
class Dog1 extends Animal1
{
    Dog1()
    {
        super();
        System.out.println("Dog1 constructor");
    }


}

public class Consuctor1 {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();

    }
}
