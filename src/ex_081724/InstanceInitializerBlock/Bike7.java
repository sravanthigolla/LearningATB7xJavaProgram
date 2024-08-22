package ex_081724.InstanceInitializerBlock;
//What is invoked first, instance initializer block or constructor?
public class Bike7 {

    int speed;

    Bike7()
    {
        System.out.println("Constructor is invoked");
    }

    {
        System.out.println("instance initializer block is invoked");
    }
    public static void main(String[] args) {
      Bike7 b3 = new Bike7();
      Bike7 b4 = new Bike7();
    }

}

//it seems that instance initializer block is firstly invoked but NO. Instance intializer block is invoked at the time of object creation. The java compiler copies the instance initializer block in the constructor after the first statement super().
// So firstly, constructor is invoked.
/*
There are mainly three rules for the instance initializer block. They are as follows:
The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.*/