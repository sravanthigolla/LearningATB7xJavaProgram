package Synchronization;

//If you make any static method as synchronized, the lock will be on the class not on object.
//Problem without static synchronization
//Suppose there are two objects of a shared class (e.g. Table) named object1 and object2.
// In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.
// But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock.

class Table3
{
    synchronized static void printTable(int n)
    {//method static synchronized
        for(int i =1;i<=5;i++)
        {
            System.out.println(n*i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread3 extends Thread
{


    public void run()
    {
        Table3.printTable(5);
    }

}

class MyThread4 extends Thread
{
       public void run()
    {
        Table3.printTable(100);
    }
}



public class StaticSynchronization {

    public static void main(String[] args) {
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        t3.start();
        t4.start();
    }
}
