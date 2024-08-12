package ex_081024.Aggregation;

class Operation
{
    int square(int n)  //Operation has square. access modifier is default.
    {
        return n*n;
    }
}

class Circle
{
    Operation op = new Operation(); //parent object
    double pi = 3.14;
    double area(int r)
    {
        int rsquare = op.square(r); //using parent method without inheritance is called aggregation. code reusability
        return pi * rsquare ;
    }

}


public class Aggregate {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area(3));
    }

}
