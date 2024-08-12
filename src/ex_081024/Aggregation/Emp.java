package ex_081024.Aggregation;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name + " " + address.city + " " + address.country+address.state);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Hyderabad", "Telangana", "IN");//calling parent constructor
        Emp emp1 = new Emp(1, "Mary", address1); //using parent constructor. aggregation
        emp1.display();
    }
}
