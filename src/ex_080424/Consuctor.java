package ex_080424;

public class Consuctor {
    String name;
    long phone;

    public Consuctor() {
        name = "constructor";
        phone = 0;
    }

    public Consuctor(String name) {
        this.name = name;
    }

    public Consuctor(String name, long phone) {
        this.name = name;
        this.phone = phone;

    }

    public Consuctor(long phone) {
        this.phone = phone;
    }

    public void printdetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}
