package Synchronization;


class Table2
{
   void printTable(int n)
    {
        synchronized (this)
        {
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
}

class MyThread7 extends Thread
{
    Table2 t;
    MyThread7(Table2 t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(5);
    }

}

class MyThread8 extends Thread
{
    Table2 t;
    MyThread8(Table2 t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(100);
    }
}

//Java synchronized block is more efficient than Java synchronized method.

public class SynchronizedBlock {
    public static void main(String[] args) {
        Table2 obj = new Table2();
        MyThread7 t1 = new MyThread7(obj);
        MyThread8 t2 = new MyThread8(obj);
        //2 threads 1 object(shared resource)
        t1.start();
        t2.start();
    }

}
