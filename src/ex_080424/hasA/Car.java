package ex_080424.hasA;

public class Car {

    //aggregation - hasA
    void StartCar()
    {
        new Engine().start();
        new Tyres().rolling();
    }
}
