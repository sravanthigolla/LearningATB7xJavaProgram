package ex_081424.Abstraction;

public class Runner extends Abstract1{
    @Override
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
         Runner r = new Runner();
         r.run();
         Abstract1 a = new Runner(); //runtime polymophism
         a.run();
         a.nonabstract();//first it checks in child if not present checks in parent
    }
}
