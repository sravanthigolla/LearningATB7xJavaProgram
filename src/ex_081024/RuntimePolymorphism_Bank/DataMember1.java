package ex_081024.RuntimePolymorphism_Bank;
//A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

class Bike
{
    int speedlimit=90;

}

class Honda extends Bike
{
    int speedlimit=190;
}



public class DataMember1 {
public static void main(String[] args) {
    Bike bike = new Honda();//Runtime polymorphism can't be achieved by data members.
    System.out.println(bike.speedlimit); //parent data member will be called instead of child
}

}
