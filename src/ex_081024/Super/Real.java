package ex_081024.Super;

class person
{
    String name;
    int id;
    person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class Emp1 extends person
{
    float salary;
    Emp1(int id, String name, float salary)
    {
        super(id, name);//reusing parent constructor
        this.salary = salary;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Real {
    public static void main(String[] args) {
     Emp1 emp1 = new Emp1(1, "John", 20000);
     emp1.display();
    }
}
