package ex_080424.MultilevelInheritance;

public class Runner {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father();
        GrandFather grandFather = new GrandFather();

        son.BHK1();
        son.BHK2();
        son.BHK3();
        son.home();//if child, father and grandfather has same function then local will be used. If child does not have
        //function it uses father. if father does have function it uses grandfather

        father.BHK1();
        father.BHK2();

        grandFather.BHK1();




    }
}
