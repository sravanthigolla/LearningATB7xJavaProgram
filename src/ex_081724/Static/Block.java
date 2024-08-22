package ex_081724.Static;
//Is used to initialize the static data member.
//It is executed before the main method at the time of classloading.

class s1
{
static String college;
//static block- called at time of classloading. So it will be called only once
static{
    System.out.println("static block is invoked");
    college = "ITS";
    System.out.println("college"+college);
}
//InstanceInitialize block- called when ever object is created
    {
        int speed =100;
        System.out.println("speed"+speed);
    }

}

public class Block {

        public static void main(String args[]){
            System.out.println("Hello main");

            s1  a = new s1();
            s1 b = new s1();


        }

}
