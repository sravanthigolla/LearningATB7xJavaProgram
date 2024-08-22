package ex_081724.InstanceInitializerBlock;
//Instance Initializer block is used to initialize the instance data member.
//It run each time when object of the class is created

public class Bike {
    int speed;

    Bike()
    {
        System.out.println("speed is "+speed);
    }
//Instance Initializer Block
    {
        speed = 100;
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();

    }
}
