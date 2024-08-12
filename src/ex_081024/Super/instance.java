package ex_081024.Super;
//super is used to refer immediate parent class instance variable.
class Animal{
    String color="white";
}
class Cat extends Animal{
    String color="black";
    void printColor()
    {
        System.out.println(color); //child class instance variable
        System.out.println(super.color);//parent class instance variable
    }
}
public class instance {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.printColor();
    }
}
