package MultiThreading;

public class ThreadClass {

    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("Workers");

        Worker w1 = new Worker(threadGroup, "W1");
        w1.start();

        Worker w2 = new Worker(threadGroup, "W2");
        w2.start();



   for(int i =0; i < 10; i++)
    {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

//Thread by class
class Worker extends Thread{

    //Constructor
    Worker(ThreadGroup threadGroup, String name)
    {
        super(threadGroup, name);
    }

@Override

    public void run()
    {
        for(int i =0; i<10; i++)
        {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }

}